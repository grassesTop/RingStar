package grasses.top.comb.thing.inorganic

import grasses.top.comb.base.Substance
import grasses.top.comb.process.Turn
import grasses.top.comb.process.TurnLife
import grasses.top.comb.thing.HighTemperature
import grasses.top.comb.thing.LowTemperature
import grasses.top.comb.thing.StrongWind

class Fire : InorganicSubstance(), TurnLife, HighTemperature {
    init {
        name = "火"
    }

    private var durationTurn = 2
    fun addFireWood() {
        durationTurn = 2
    }

    override fun mergeSubstance(substance: Substance): Substance? {
        if (substance is LowTemperature) {
            dismiss()
        } else if (substance is StrongWind) {
            dismiss()
        } else if (substance is Dust){
            dismiss()
        }
        return null
    }

    override fun onTurnStart(turn: Turn) {

    }

    override fun onTurnChoiceCardStart() {

    }

    override fun onTurnEffectSkill() {

    }

    override fun onTurnEnd() {
        durationTurn--
        if (durationTurn <= 0) {
            dismiss()
        }
    }
}