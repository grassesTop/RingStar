package grasses.top.comb.card.spirit

import grasses.top.comb.base.BaseElement
import grasses.top.comb.base.Card
import grasses.top.comb.base.User
import grasses.top.comb.status.PetrificationStatus

class PetrificationSpell:Card() {
    init {
        star = 3
        name = "石化术"
        formula = arrayListOf(BaseElement.Earth,BaseElement.Spirit,BaseElement.Spirit)
        spellDuration = 30
        description = "看向自己的角色被石化"
        elementSeries = BaseElement.Earth
    }

    override fun effect() {
        super.effect()
        var lookUsers = arrayListOf<User>()
        for (lookUser in lookUsers) {
            lookUser.addStatus(PetrificationStatus())
        }

    }


}