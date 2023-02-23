package grasses.top.comb.thing.inorganic

import grasses.top.comb.base.Substance
import grasses.top.comb.thing.Combustible
import grasses.top.comb.thing.Explosive
import grasses.top.comb.thing.HighTemperature

class Oil: InorganicSubstance(), Explosive, Combustible {
    init {
        name = "油"
    }

    override fun mergeSubstance(substance: Substance): Substance? {
        if (substance is HighTemperature){
            //todo 爆炸
            //todo 传递
            dismiss()
            return Fire()
        }
        return super.mergeSubstance(substance)
    }
}