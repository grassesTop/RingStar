package grasses.top.comb.card

import grasses.top.comb.base.BaseElement
import grasses.top.comb.base.Card

class FireBall : Card() {
    init {
        star = 1
        name = "火球术"
        formula = arrayListOf(BaseElement.Fire)
        spellDuration = 10
        elementSeries = BaseElement.Fire
    }

    override fun upgrade(element: BaseElement): Card? {
        when(element){
            BaseElement.Fire->{
                return BigFireBall()
            }
            else -> {}
        }
        return super.upgrade(element)
    }

}