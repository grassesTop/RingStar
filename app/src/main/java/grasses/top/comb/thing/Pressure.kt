package grasses.top.comb.thing

import grasses.top.comb.process.Turn
import grasses.top.comb.process.TurnLife

class Pressure:InorganicSubstance(),TurnLife,LowPressure {
    init {
        name = "高压"
    }
    var durationTurn = 1
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
        dismiss()
    }
}