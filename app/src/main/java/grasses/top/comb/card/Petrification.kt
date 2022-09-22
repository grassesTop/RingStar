package grasses.top.comb.card

import grasses.top.comb.base.BaseElement
import grasses.top.comb.base.Card

class Petrification:Card() {
    init {
        star = 3
        name = "石化术"
        formula = arrayListOf(BaseElement.Earth,BaseElement.Spirit,BaseElement.Spirit)
        spellDuration = 30
        description = "看向自己的角色被石化"
        elementSeries = BaseElement.Earth
    }



}