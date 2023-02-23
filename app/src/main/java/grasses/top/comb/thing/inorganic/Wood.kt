package grasses.top.comb.thing.inorganic

import grasses.top.comb.base.Substance
import grasses.top.comb.thing.inorganic.Carbon
import grasses.top.comb.thing.inorganic.Fire
import grasses.top.comb.thing.inorganic.InorganicSubstance

class Wood: InorganicSubstance() {
    init {
        name = "木头"
    }

    override fun mergeSubstance(substance: Substance): Substance? {
        if (substance is Fire){
            //todo 传递
            substance.addFireWood()
            dismiss()
            return Carbon()
        }
        return super.mergeSubstance(substance)
    }
}