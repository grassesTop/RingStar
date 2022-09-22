package grasses.top.comb.thing

import grasses.top.comb.base.Substance

class Iron:InorganicSubstance() {
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