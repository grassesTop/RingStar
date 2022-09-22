package grasses.top.comb.thing

import grasses.top.comb.base.Substance

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