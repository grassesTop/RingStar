package grasses.top.comb.process

import android.graphics.PointF
import grasses.top.comb.base.*
import grasses.top.comb.card.CardNode
import kotlin.random.Random

class BattleController(var user: User) : BattleLife,TurnLife{
    //已消耗的施法时间,每个回合开始时清零
    var consumedSpellDuration = 0

    //已持有的元素能量
    var energy : ArrayList<BaseElement> = arrayListOf()
    //操作当前角色的玩家
    var player: Player? = null
    //是否结束当前回合
    var endThisTurn = false
    //选择要释放的法术
    var choiceCards : CardNode? = null
    //战斗流程
    var battleProcess : BattleProcess? = null

    override fun onBattleStart(battleProcess: BattleProcess) {
        user.healthy = user.maxHP
        this.battleProcess = battleProcess
        user.currentStatus.addAll(user.race.getRaceStatus())
        user.currentStatus.forEach {
            it.attach(user)
            it.onBattleStart(battleProcess)
        }
    }
    //当前位置
    var pointF : PointF = PointF()

    /**
     * 战斗开始时生成5颗能量
     */
    override fun onBattleEnd() {
        user.currentStatus.clear()
        repeat(5){
            createElement(generateElementEnergy())
        }
        user.currentStatus.forEach { it.onBattleEnd() }
    }

    /**
     * 每回合生成2颗能量
     */
    override fun onTurnStart(turn: Turn) {
        consumedSpellDuration = 0
        repeat(2){
            createElement(generateElementEnergy())
        }
        user.currentStatus.forEach {
            it.onTurnStart(turn)
        }
        user.computeResistance()
    }

    /**
     * 选择要释放的法术
     */
    override fun onTurnChoiceCardStart() {
        choiceCards = choiceCards()
    }

    /**
     * 释放已经选择的法术
     */
    override fun onTurnEffectSkill() {
        while (choiceCards != null) {
            consumeElement(choiceCards?.card)
            choiceCards?.card?.spell(choiceCards?.spellDuration?:0)
            choiceCards = choiceCards?.next
        }
    }

    override fun onTurnEnd() {
        user.currentStatus.forEach { it.onTurnEnd()}
    }
    var generateElementRandom = Random(user.elementTalent.size)
    fun generateElementEnergy():BaseElement{
        return user.elementTalent[generateElementRandom.nextInt()]
    }

    fun createElement(baseElement: BaseElement){
        if (energy.size < user.maxEnergySize){
            energy.add(baseElement)
        }
    }

    fun removeElement(baseElement: BaseElement){
        energy.removeIf { it.index == baseElement.index }
    }

    /**
     * 消耗元素力
     */
    private fun consumeElement(card : Card?){
        card?.formula?.forEach { material->
            energy.removeAt(energy.indexOfFirst { material.index == it.index })
        }
    }

    /**
     * 选择想要释放的法术
     */
    fun choiceCards(): CardNode?{
        var head : CardNode? = CardNode(Card(),User())
        var cards = head
        while (consumedSpellDuration < user.spellSpeed || !endThisTurn){
            var card = player?.choiceSpellCard(user)
            if (card == null){
                endThisTurn = true
                break
            }
            consumedSpellDuration += card.spellDuration
            cards?.next = CardNode(card,user).also {
                it.spellDuration = Math.max(0,consumedSpellDuration-user.spellSpeed)
            }
            cards = cards?.next
        }
        return head?.next
    }






}