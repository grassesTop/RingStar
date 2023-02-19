package grasses.top.comb.card.earth

import grasses.top.comb.base.BaseElement
import grasses.top.comb.base.Card
import grasses.top.comb.status.StoneSkinStatus

class StoneSkin : Card(){
    init {
        name = "石肤术"
        elementSeries = BaseElement.Earth
        spellDuration = 10
        formula = arrayListOf(BaseElement.Earth)
        description = "增加2物理防御,火焰防御2,持续10回合"
    }

    override fun effect() {
        super.effect()
        speller?.addStatus(StoneSkinStatus())
    }

}