package grasses.top.comb.thing.inorganic

import grasses.top.comb.base.Substance
import grasses.top.comb.thing.StrongWind

class Dust : InorganicSubstance() {
    init {
        name = "尘埃"
    }

    override fun mergeSubstance(substance: Substance): Substance? {
        if (substance is StrongWind){
            dismiss()
        }
        return super.mergeSubstance(substance)
    }
}