package grasses.top.comb.thing.inorganic

import grasses.top.comb.base.Substance
import grasses.top.comb.process.Turn
import grasses.top.comb.process.TurnLife
import grasses.top.comb.thing.inorganic.InorganicSubstance

class Thunder: InorganicSubstance(),TurnLife {

    override fun mergeSubstance(substance: Substance): Substance? {
        return super.mergeSubstance(substance)
    }

    override fun onTurnStart(turn: Turn) {

    }

    override fun onTurnChoiceCardStart() {

    }

    override fun onTurnEffectSkill() {

    }

    override fun onTurnEnd() {
        dismiss()
    }


}