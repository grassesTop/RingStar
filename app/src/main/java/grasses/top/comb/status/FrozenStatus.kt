package grasses.top.comb.status

import grasses.top.comb.base.BattleProcess
import grasses.top.comb.base.Status
import grasses.top.comb.process.Turn

class FrozenStatus : Status() {
    var layer : Int = 0
    init {
        name = "冰冻"
        description = "减少${layer}点施法速度.每回合减少一半层数.和烧伤状态互斥"
    }
    override fun inCreateLayer() {
        TODO("Not yet implemented")
    }

    override fun disCreateLayer() {
        TODO("Not yet implemented")
    }

    override fun onBattleStart(battleProcess: BattleProcess) {
        TODO("Not yet implemented")
    }

    override fun onBattleEnd() {
        TODO("Not yet implemented")
    }

    override fun onTurnStart(turn: Turn) {
        TODO("Not yet implemented")
    }

    override fun onTurnChoiceCardStart() {
        TODO("Not yet implemented")
    }

    override fun onTurnEffectSkill() {
        TODO("Not yet implemented")
    }

    override fun onTurnEnd() {
        TODO("Not yet implemented")
    }
}