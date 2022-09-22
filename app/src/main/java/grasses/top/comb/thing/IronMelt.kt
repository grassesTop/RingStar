package grasses.top.comb.thing

import grasses.top.comb.base.Substance

class IronMelt : InorganicSubstance(),UltrahighTemperature {
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