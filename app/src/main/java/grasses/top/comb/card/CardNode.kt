package grasses.top.comb.card

import grasses.top.comb.base.Card
import grasses.top.comb.base.User

class CardNode(var card : Card, var user : User){
    var next : CardNode? = null
    var spellDuration : Int = 0
    var isFastSpell = false
    get() {
        return spellDuration == 0
    }
}
