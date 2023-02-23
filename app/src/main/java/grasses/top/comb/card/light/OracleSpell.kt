package grasses.top.comb.card.light

import grasses.top.comb.base.BaseElement
import grasses.top.comb.base.Card
import grasses.top.comb.status.ResistanceChangeStatus
import grasses.top.comb.user.Resistance

class OracleSpell: Card() {
    init {
        star = 4
        name = "天启"
        formula = arrayListOf(BaseElement.Light,BaseElement.Light,BaseElement.Light,BaseElement.Light)
        spellDuration = 40
        elementSeries = BaseElement.Light
        description = "增加自己的所有抗性4点,提升自身的阶级到4,每回合额外生成一个光属性元素,持续4回合"
    }

    override fun effect() {
        super.effect()
        speller?.addStatus(ResistanceChangeStatus().also {
            it.name = "天启"
            it.durationTime = 4
            it.changeResistance = Resistance.ResistanceData(4)
        })
    }
}