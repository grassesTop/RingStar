package grasses.top.comb.thing.inorganic

import grasses.top.comb.base.Substance
import grasses.top.comb.damage.Burn
import grasses.top.comb.damage.Frostbite
import grasses.top.comb.damage.Lash
import grasses.top.comb.thing.organic.OrganicSubstance

class Tree: OrganicSubstance() {
    init {
        name = "树木"
    }

    override fun mergeSubstance(substance: Substance): Substance? {
        if (substance is Fire) {
            takeDamage(Burn().also {
                it.damage = 10
            })
            if (isDeath){
                dismiss()
                return Carbon()
            }
        }else if (substance is Water){
            increaseHP(10)
        }else if (substance is Ice){
            takeDamage(Frostbite().also {
                it.damage = 5
            })
            if (isDeath){
                dismiss()
                return Wood()
            }
        }else if (substance is Pressure || substance is Shock){
            takeDamage(Lash().also {
                it.damage = 5
            })
            if (isDeath){
                dismiss()
                return Wood()
            }
        }
        return super.mergeSubstance(substance)
    }

}