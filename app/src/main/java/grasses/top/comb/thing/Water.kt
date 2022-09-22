package grasses.top.comb.thing

import grasses.top.comb.base.Substance


class Water : InorganicSubstance() {
    init {
        name = "水"
    }

    override fun mergeSubstance(substance: Substance): Substance? {
        when (substance.javaClass){
            Ice::javaClass -> {
                dismiss()
                return Ice()
            }
            Fire::javaClass -> {
                dismiss()
                substance.dismiss()
                return Fog()
            }
            Thunder::javaClass ->{
                //传递
                //找到当前的位置,寻找所有相连的water,然后同时触发导电反应
            }
        }
        return super.mergeSubstance(substance)
    }
}