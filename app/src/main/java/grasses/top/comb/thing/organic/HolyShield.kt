package grasses.top.comb.thing.organic

import grasses.top.comb.base.User
import grasses.top.comb.user.Resistance

class HolyShield(user: User) : Shield() {
    init {
        name = "圣盾"
        maxHP = 10
        resistance.superposeResistance(Resistance.ResistanceData(spiritResistance = 5))
        description = "跟随一个角色,抵挡灵魂伤害"
    }
}