package grasses.top.comb.status

import grasses.top.comb.process.BattleProcess
import grasses.top.comb.base.Status
import grasses.top.comb.process.Turn


class ToughnessStatus:Status() {
    init {
        name = "韧性"
        description = "在战斗开始时,增加角色的一点精神抗性"
    }
    override fun inCreateLayer() {
        TODO("Not yet implemented")
    }

    override fun disCreateLayer() {
        TODO("Not yet implemented")
    }

    override fun onBattleStart(battleProcess: BattleProcess) {
        organicSubstance?.resistance?.spiritResistance?.and(1)
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