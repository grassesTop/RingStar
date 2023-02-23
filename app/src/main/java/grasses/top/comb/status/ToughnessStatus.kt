package grasses.top.comb.status

import grasses.top.comb.process.BattleProcess
import grasses.top.comb.base.Status
import grasses.top.comb.process.Turn
import grasses.top.comb.user.Resistance


class ToughnessStatus:Status() {
    init {
        name = "韧性"
        description = "在战斗开始时,增加角色的一点精神抗性"
        durationTime = -1
    }

    override fun getOffsetResistance(): Resistance.ResistanceData? {
        return Resistance.ResistanceData(spiritResistance = 1)
    }
}