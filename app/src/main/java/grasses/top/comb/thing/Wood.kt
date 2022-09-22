package grasses.top.comb.thing

import grasses.top.comb.base.Substance
import java.io.File

class Wood:InorganicSubstance() {
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