package grasses.top.comb.card.light

import grasses.top.comb.base.BaseElement
import grasses.top.comb.base.Card
import grasses.top.comb.status.ProphecyStatus

class ProphecySpell : Card() {
    init {
        star = 2
        name = "预言术"
        formula = arrayListOf(
            BaseElement.Light,
            BaseElement.Time,)
        spellDuration = 10
        elementSeries = BaseElement.Light
        description = "预言一个属性,闪避下一个命中的该属性的技能"
    }

    override fun effect() {
        super.effect()
        speller?.addStatus(ProphecyStatus(waitPointElement()))
    }

    fun waitPointElement() : BaseElement {
        return BaseElement.Dark
    }

}