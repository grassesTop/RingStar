package grasses.top.comb.status

import grasses.top.comb.process.BattleProcess
import grasses.top.comb.base.Status
import grasses.top.comb.process.Turn


class FireStatus : Status() {
    var durationTurn = 2
    init {
        name = "燃烧"
        description = "造成3点火属性伤害,持续${durationTurn}个回合.和冰冻状态互斥"
    }

    override fun onTurnEnd() {
        durationTurn--
        if (durationTurn == 0){
            disAttach()
        }
    }
}