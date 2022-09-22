package grasses.top.comb.thing

import grasses.top.comb.base.Substance

class Fog : InorganicSubstance(),GaseousState {
    init {
        name = "雾"
    }

    override fun mergeSubstance(substance: Substance): Substance? {
        if (substance is StrongWind){
            dismiss()
        }else if (substance is HighTemperature){
            dismiss()
        }else if (substance is LowTemperature){
            dismiss()
            return Water()
        }
        return super.mergeSubstance(substance)
    }
}