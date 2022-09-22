package grasses.top.comb.thing

import grasses.top.comb.base.Substance

class Ice : InorganicSubstance(),LowTemperature,UltraLowTemperature {
    init {
        name = "冰"
    }

    override fun mergeSubstance(substance: Substance): Substance? {
        if (substance is UltrahighPressure){
            dismiss()
            return Fog()
        }else if (substance is HighTemperature){
            dismiss()
            return Water()
        }
        return super.mergeSubstance(substance)
    }
}