package grasses.top.comb.user

import grasses.top.comb.base.Damage
import grasses.top.comb.base.Status
import grasses.top.comb.damage.*
import grasses.top.comb.thing.OrganicSubstance

/**
 * 抗性
 */
open class Resistance(var organicSubstance: OrganicSubstance) {
    companion object {
        const val RELEVANT_NONE = 0
        const val RELEVANT_IMMUNE = 1 shl 1
    }

    /**
     * 是否免疫某种状态
     */
    open fun isImmuneState(status: Status): Boolean {
        var find = organicSubstance.currentStatus.find { it.relevant(status) == RELEVANT_IMMUNE }
        if (find != null) return true
        return false
    }

    fun superposeResistance(offsetResistanceData : ResistanceData?){
        if (offsetResistanceData != null) {
            resistanceData.defense += offsetResistanceData.defense
            resistanceData.burnResistance += offsetResistanceData.burnResistance
            resistanceData.frostbiteResistance += offsetResistanceData.frostbiteResistance
            resistanceData.lashResistance += offsetResistanceData.lashResistance
            resistanceData.punctureResistance += offsetResistanceData.punctureResistance
            resistanceData.spiritResistance += offsetResistanceData.spiritResistance
            resistanceData.splitResistance += offsetResistanceData.splitResistance
        }
    }

    /**
     * 抗性,最终伤害会减去该值
     */
    val resistanceData = ResistanceData(0,0,0,0,0,0,0)

    /**
     * 对应伤害类型的抗性,可能为负数
     */
    open fun getResistanceForDamage(damage: Damage): Int {
        return when (damage.javaClass) {
            Burn::javaClass -> resistanceData.burnResistance
            Frostbite::javaClass -> resistanceData.frostbiteResistance
            Lash::javaClass -> resistanceData.lashResistance
            Puncture::javaClass -> resistanceData.punctureResistance
            Spirit::javaClass -> resistanceData.spiritResistance
            Split::javaClass -> resistanceData.splitResistance
            else -> 0
        }
    }

    data class ResistanceData(
        var defense : Int = 0,
        var burnResistance: Int = 0,
        var frostbiteResistance: Int = 0,
        var lashResistance: Int = 0,
        var punctureResistance: Int = 0,
        var spiritResistance: Int = 0,
        var splitResistance: Int = 0,
    )


}