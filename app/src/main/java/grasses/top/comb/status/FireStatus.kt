package grasses.top.comb.status

import grasses.top.comb.base.BattleProcess
import grasses.top.comb.base.Status
import grasses.top.comb.process.Turn


class FireStatus : Status() {
    var durationTurn = 2
    init {
        name = "燃烧"
        description = "造成3点火属性伤害,持续${durationTurn}个回合.和冰冻状态互斥"
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

    }

    override fun onTurnStart(turn: Turn) {

    }

    override fun onTurnChoiceCardStart() {
        TODO("Not yet implemented")
    }

    override fun onTurnEffectSkill() {
        TODO("Not yet implemented")
    }

    override fun onTurnEnd() {
        durationTurn--
        if (durationTurn == 0){
            disAttach()
        }
    }
}