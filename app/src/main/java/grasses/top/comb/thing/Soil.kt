package grasses.top.comb.thing

import grasses.top.comb.base.Substance

class Soil:InorganicSubstance() {
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