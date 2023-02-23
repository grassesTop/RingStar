package grasses.top.comb.status

import grasses.top.comb.base.Status
import grasses.top.comb.base.User
import grasses.top.comb.process.Turn

class ElementChangeStatus : Status() {
    init {
        name = "元素量变化"
    }

    override fun onTurnStart(turn: Turn) {
        super.onTurnStart(turn)
        if (organicSubstance is User) {

        }
    }
}