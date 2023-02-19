package grasses.top.comb.card.fire

import grasses.top.comb.base.BaseElement
import grasses.top.comb.base.Card

class FireBallSpell : Card() {
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
                return BigFireBallSpell()
            }
            else -> {}
        }
        return super.upgrade(element)
    }

}