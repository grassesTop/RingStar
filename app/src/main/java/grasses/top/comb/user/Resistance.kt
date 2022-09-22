package grasses.top.comb.user

import grasses.top.comb.base.Damage
import grasses.top.comb.base.Status
import grasses.top.comb.damage.*
import grasses.top.comb.thing.OrganicSubstance

/**
 * 抗性
 */
open class Resistance(var organicSubstance: OrganicSubstance) {
    companion object{
        const val RELEVANT_NONE = 0
        const val RELEVANT_IMMUNE = 1 shl 1
    }

    /**
     * 是否免疫某种状态
     */
    open fun isImmuneState(status: Status):Boolean{
        var find = organicSubstance.currentStatus.find { it.relevant(status) == RELEVANT_IMMUNE }
        if (find != null)return true
        return false
    }

    /**
     * 防御值,最终伤害会减去该值
     */
    var defense = 0

    /**
     * 对应的抗性
     */
    var burnResistance = 0
    var frostbiteResistance = 0
    var lashResistance = 0
    var punctureResistance = 0
    var spiritResistance = 0
    var splitResistance = 0


    /**
     * 对应伤害类型的抗性,可能为负数
     */
    open fun getResistanceForDamage(damage: Damage):Int{
        return when(damage.javaClass){
            Burn::javaClass -> burnResistance
            Frostbite::javaClass -> frostbiteResistance
            Lash::javaClass -> lashResistance
            Puncture::javaClass -> punctureResistance
            Spirit::javaClass -> spiritResistance
            Split::javaClass -> splitResistance
            else->0
        }
    }

}