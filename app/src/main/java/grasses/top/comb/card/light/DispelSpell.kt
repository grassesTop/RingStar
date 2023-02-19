package grasses.top.comb.card.light

import grasses.top.comb.base.BaseElement
import grasses.top.comb.base.Card

class DispelSpell: Card() {
    init {
        star = 2
        name = "驱散"
        formula = arrayListOf(BaseElement.Light,BaseElement.Light)
        spellDuration = 20
        elementSeries = BaseElement.Light
        description = "驱散低阶暗属性召唤物"
    }

    override fun effect() {
        super.effect()
        var users = findAllEffectUser()
        users.forEach { user->
            if (user.isSummon && user.elementSeries == BaseElement.Dark && user.grade <= 2) {
                user.dismiss()
            }
        }

    }
}