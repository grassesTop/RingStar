package grasses.top.comb.thing.inorganic

import grasses.top.comb.base.Substance
import grasses.top.comb.thing.UltrahighTemperature

class Soil: InorganicSubstance() {
    init {
        name = "土"
    }

    override fun mergeSubstance(substance: Substance): Substance? {
        if (substance is UltrahighTemperature){
            dismiss()
            return Magma()
        }
        return super.mergeSubstance(substance)
    }
}