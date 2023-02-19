package grasses.top.comb.status

import grasses.top.comb.process.BattleProcess
import grasses.top.comb.base.Status
import grasses.top.comb.process.Turn
import grasses.top.comb.user.Resistance

class SpiritBodyStatus:Status() {
    init {
        name = "灵体"
        description = "免疫流血"
    }

    override fun relevant(status: Status): Int {
        if (status is BleedStatus){
            return Resistance.RELEVANT_IMMUNE
        }else return super.relevant(status)
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