package grasses.top.comb.card.light

import grasses.top.comb.base.BaseElement
import grasses.top.comb.base.Card

class IlluminateSpell :Card() {
    init {
        star = 1
        name = "照明术"
        formula = arrayListOf(BaseElement.Light)
        spellDuration = 10
        elementSeries = BaseElement.Light
        description = "指定一个半径10的圆形区域,照明视野,并且解除区域内的所有隐藏,潜行效果"
    }

}