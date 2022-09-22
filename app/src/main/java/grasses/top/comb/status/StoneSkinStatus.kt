package grasses.top.comb.status

import grasses.top.comb.base.BattleProcess
import grasses.top.comb.base.Status
import grasses.top.comb.process.Turn
import grasses.top.comb.thing.OrganicSubstance

class StoneSkinStatus:Status() {
    init {
        name = "石肤术"
    }
    var durationTurn = 10
    override fun inCreateLayer() {
        durationTurn = 10
    }

    override fun attach(user: OrganicSubstance) {
        super.attach(user)
        user.resistance.splitResistance.plus(1)
        user.resistance.burnResistance.plus(1)
    }

    override fun disAttach() {
        organicSubstance?.resistance?.splitResistance?.plus(-1)
        organicSubstance?.resistance?.burnResistance?.plus(-1)
        super.disAttach()
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