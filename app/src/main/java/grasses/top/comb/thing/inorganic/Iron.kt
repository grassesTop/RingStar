package grasses.top.comb.thing.inorganic

import grasses.top.comb.base.Substance
import grasses.top.comb.thing.UltrahighTemperature

class Iron: InorganicSubstance() {
    init {
        name = "铁"
    }

    override fun mergeSubstance(substance: Substance): Substance? {
        if (substance is Thunder){
            //todo 导电
        }else if (substance is UltrahighTemperature){
            dismiss()
            return IronMelt()
        }
        return super.mergeSubstance(substance)
    }
}