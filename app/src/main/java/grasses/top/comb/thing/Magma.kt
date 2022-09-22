package grasses.top.comb.thing

import grasses.top.comb.base.Substance

class Magma:InorganicSubstance(),UltrahighTemperature {
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