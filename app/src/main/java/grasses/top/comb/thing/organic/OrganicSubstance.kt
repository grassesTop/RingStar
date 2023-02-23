package grasses.top.comb.thing.organic

import grasses.top.comb.base.Card
import grasses.top.comb.base.Damage
import grasses.top.comb.base.Status
import grasses.top.comb.base.Substance
import grasses.top.comb.user.Resistance

/**
 * 一切有生命条的物体
 */
open class OrganicSubstance : Substance() {
    var healthy = 1000
    var maxHP = 1000
    val resistance = Resistance(this)
    var isDeath = false//状态,正面状态和负面状态,以及中立状态
    var currentStatus: ArrayList<Status> = arrayListOf()
    var description = "描述"

    fun decreaseHP(decreasedHP: Int) {
        if (decreasedHP <= 0) return
        healthy = Math.max(0, healthy - Math.max(0, decreasedHP))
        if (healthy == 0) {
            dismiss()
        }
    }

    fun death() {
        isDeath = true
    }

    fun increaseHP(increasedHP: Int) {
        if (increasedHP <= 0) return
        healthy = Math.min(maxHP, healthy + increasedHP)
    }

    fun takeDamage(damage: Damage) {
        val resistanceForDamage = resistance.getResistanceForDamage(damage)
        decreaseHP(Math.min(0, damage.damage - resistanceForDamage))
    }

    fun addStatus(status: Status) {
        val find = currentStatus.find { it.javaClass == status.javaClass }
        if (find != null) {
            find.inCreateLayer()
        } else {
            currentStatus.add(status)
            status.attach(this)
            status.inCreateLayer()
        }
    }

    fun removeStatus(status: Status) {
        currentStatus.filter { it.javaClass == status.javaClass }.forEach {
            it.disAttach()
            currentStatus.remove(it)
        }
    }

    fun computeResistance() {
        for (currentStatus in currentStatus) {
            resistance.superposeResistance(currentStatus.getOffsetResistance())
        }
    }

    fun hit(card: Card): Boolean {
        return true
    }
}