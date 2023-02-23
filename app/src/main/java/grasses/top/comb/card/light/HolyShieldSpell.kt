package grasses.top.comb.card.light

import grasses.top.comb.base.BaseElement
import grasses.top.comb.base.Card
import grasses.top.comb.thing.organic.HolyShield

class HolyShieldSpell : Card() {
    init {
        star = 2
        name = "圣盾"
        formula = arrayListOf(BaseElement.Light, BaseElement.Light)
        spellDuration = 20
        elementSeries = BaseElement.Light
        description = "围绕自身生成一个光属性防御罩,增加两点光抗,"
    }

    override fun effect() {
        super.effect()
        HolyShield(speller!!)
    }
}