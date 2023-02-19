package grasses.top.comb.card.fire

import grasses.top.comb.base.BaseElement
import grasses.top.comb.base.Card

class BigFireBall : Card() {
    init {
        name = "大火球"
        star = 2
        formula = arrayListOf(BaseElement.Fire, BaseElement.Fire)
        spellDuration = 20
        elementSeries = BaseElement.Fire
    }

}