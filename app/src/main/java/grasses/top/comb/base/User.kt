package grasses.top.comb.base

import grasses.top.comb.process.BattleController
import grasses.top.comb.process.BattleLife
import grasses.top.comb.process.Turn
import grasses.top.comb.process.TurnLife
import grasses.top.comb.thing.OrganicSubstance
import grasses.top.comb.user.Race
import grasses.top.comb.user.Resistance
import grasses.top.comb.user.Shape

open class User : OrganicSubstance(), BattleLife,TurnLife{
    //种族
    var race : Race = Race(Race.UnKnow)
    //体型
    var shape : Shape = Shape(10f)
    //施法速度
    var spellSpeed = 10
    //元素天赋,影响生成元素的概率和类型
    var elementTalent : ArrayList<BaseElement> = arrayListOf()
    //最大持有元素能量个数
    var maxEnergySize = 10
    //战斗流程控制器
    protected var battleController : BattleController? = null
    override fun onBattleStart(battleProcess: BattleProcess) {
        battleController = BattleController(this)
        battleController?.onBattleStart(battleProcess)
    }

    override fun onBattleEnd() {
        battleController?.onBattleEnd()
    }

    override fun onTurnStart(turn: Turn) {
        battleController?.onTurnStart(turn)
    }

    override fun onTurnChoiceCardStart() {
        battleController?.onTurnChoiceCardStart()
    }

    override fun onTurnEffectSkill() {
        battleController?.onTurnEffectSkill()
    }

    override fun onTurnEnd() {
        battleController?.onTurnEnd()
    }

}