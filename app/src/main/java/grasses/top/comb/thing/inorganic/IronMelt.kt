package grasses.top.comb.thing.inorganic

import grasses.top.comb.base.Substance
import grasses.top.comb.thing.LowTemperature
import grasses.top.comb.thing.UltrahighTemperature

class IronMelt : InorganicSubstance(), UltrahighTemperature {
    init {
        name = "铁水"
    }

    override fun mergeSubstance(substance: Substance): Substance? {
        if (substance is LowTemperature){
            dismiss()
            return Iron()
        }
        return super.mergeSubstance(substance)
    }
}