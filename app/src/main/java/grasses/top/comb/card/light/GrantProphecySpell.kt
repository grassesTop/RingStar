package grasses.top.comb.card.light

import grasses.top.comb.base.BaseElement
import grasses.top.comb.base.Card
import grasses.top.comb.base.User

class GrantProphecySpell : Card() {
    init {
        star = 5
        name = "大预言术"
        formula = arrayListOf(BaseElement.Light,BaseElement.Light,BaseElement.Light,BaseElement.Light,BaseElement.Light)
        spellDuration = 10
        elementSeries = BaseElement.Light
        description = "大预言术·神说:要有光,驱散所有被光照耀到 的暗属性法术效果和暗属性生物"
    }



    override fun effect() {
        super.effect()
        val users = findAllEffectUser()
        users.forEach {user->
            if (user.elementSeries == BaseElement.Dark) {
                user.death()
            } else {
                user.currentStatus.forEach {status->
                    if (status.elementSeries == BaseElement.Dark) {
                        status.disAttach()
                    }
                }
            }
        }
        val cards = arrayListOf<Card>()
        cards.forEach { card->
            if (card.elementSeries == BaseElement.Dark) {
                card.stop()
            }
        }
    }
}