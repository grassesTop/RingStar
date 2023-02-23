package grasses.top.comb.base

import grasses.top.comb.process.BattleLife
import grasses.top.comb.process.BattleProcess
import grasses.top.comb.process.Turn
import grasses.top.comb.process.TurnLife
import grasses.top.comb.thing.organic.OrganicSubstance
import grasses.top.comb.user.Resistance

/**
 * 人物,物品上的状态
 */
abstract class Status : BattleLife ,TurnLife {
    open var name = ""
    /**
     * 状态的等级,某些低等级技能效果无法影响高等级的效果
     */
    var grade = 0
    /**
     * 是否展示战斗图标
     */
    var isShowBattleIcon = true
    var description = ""
    var organicSubstance : OrganicSubstance? = null
    var durationTime = 0
    /**
     * 该状态所属属性
     */
    var elementSeries : BaseElement = BaseElement.None
    open fun inCreateLayer(){}
    open fun disCreateLayer(){}
    open fun attach(user: OrganicSubstance){
        this.organicSubstance = user
    }
    open fun disAttach(){
        this.organicSubstance?.currentStatus?.remove(this)
        this.organicSubstance = null
    }

    open fun relevant(status : Status):Int{
        return Resistance.RELEVANT_NONE
    }

    open fun getOffsetResistance():Resistance.ResistanceData?{
        return null
    }

    override fun onBattleStart(battleProcess: BattleProcess) {

    }

    override fun onBattleEnd() {

    }

    override fun onTurnStart(turn: Turn) {

    }

    override fun onTurnChoiceCardStart() {

    }

    override fun onTurnEffectSkill() {

    }

    override fun onTurnEnd() {

    }

    open fun onHit(card : Card):Boolean{
        return true
    }

    open fun getGradeOffset():Int{
        return 0
    }
}