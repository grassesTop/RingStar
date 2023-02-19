package grasses.top.comb.status

import grasses.top.comb.base.BaseElement
import grasses.top.comb.base.Card
import grasses.top.comb.base.Status

class ProphecyStatus(val prophecyElement: BaseElement):Status() {
    init {
        elementSeries = BaseElement.Light
    }

    override fun onHit(card: Card): Boolean {
        val miss = card.elementSeries == prophecyElement
        if (miss) {
            disAttach()
        }
        return !miss
    }
}