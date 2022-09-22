package grasses.top.comb.user

import grasses.top.comb.base.User

class Emperor:User() {
    init {
        name = "张三"
        race = Race(Race.Human)
        shape = Shape(10f)
        spellSpeed = 10
        maxHP = 1000
        elementTalent = arrayListOf()
        maxEnergySize = 10
    }
}