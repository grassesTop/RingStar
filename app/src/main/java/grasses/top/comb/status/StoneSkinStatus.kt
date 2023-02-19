package grasses.top.comb.status

import grasses.top.comb.process.BattleProcess
import grasses.top.comb.base.Status
import grasses.top.comb.process.Turn
import grasses.top.comb.user.Resistance

class StoneSkinStatus:Status() {
    init {
        name = "石肤术"
    }
    var durationTurn = 10
    override fun inCreateLayer() {
        durationTurn = 10
    }

    override fun getOffsetResistance(): Resistance.ResistanceData {
        return Resistance.ResistanceData(splitResistance = 2, burnResistance = 2)
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
        durationTurn--
        if (durationTurn <= 0){
            disAttach()
        }
    }

}