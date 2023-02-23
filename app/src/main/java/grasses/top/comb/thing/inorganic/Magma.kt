package grasses.top.comb.thing.inorganic

import grasses.top.comb.base.Substance
import grasses.top.comb.thing.LowTemperature
import grasses.top.comb.thing.UltrahighTemperature

class Magma: InorganicSubstance(), UltrahighTemperature {
    init {
        name = "岩浆"
    }

    override fun mergeSubstance(substance: Substance): Substance? {
        if (substance is LowTemperature){
            dismiss()
            return Soil()
        }
        return super.mergeSubstance(substance)
    }
}