package grasses.top.comb.base

import grasses.top.comb.card.CardNode

/**
 * 玩家,可以是AI,可以是真实的玩家
 */
open class Player {
    var isMyTurn = false

    fun lockUI(){

    }
    fun unlockUI(){

    }

    /**
     * 选择要释放的法术
     */
    fun choiceSpellCard(user: User):Card?{
        return Card()
    }
}