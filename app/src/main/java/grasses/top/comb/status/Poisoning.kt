package grasses.top.comb.status

import grasses.top.comb.base.BattleProcess
import grasses.top.comb.base.Damage
import grasses.top.comb.base.Status
import grasses.top.comb.process.Turn


class Poisoning:Status() {

    init {
        name = "中毒"
        description = "回合开始时,造成 n 的伤害,层数不会自动消失"
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