package grasses.top.comb.card

import grasses.top.comb.base.BaseElement
import grasses.top.comb.base.Card

class Meteorite: Card() {
    init {
        name = "陨石天降"
        star = 5
        formula = arrayListOf(BaseElement.Earth,BaseElement.Earth,BaseElement.Earth,BaseElement.Earth,BaseElement.Earth)
        description = ""
        spellDuration = 50
    }
}