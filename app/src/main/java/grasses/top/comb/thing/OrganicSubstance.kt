package grasses.top.comb.thing

import grasses.top.comb.R
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
    var resistance = Resistance(this)
    var isDeath = false//状态,正面状态和负面状态,以及中立状态
    var currentStatus : ArrayList<Status> = arrayListOf()
    fun destroy(){
        isDeath = true
    }

    fun decreaseHP(decreasedHP:Int){
        if (decreasedHP <= 0)return
        healthy = Math.max(0,healthy-Math.max(0,decreasedHP - resistance.defense))
        if (healthy == 0){
            destroy()
        }
    }
    fun increaseHP(increasedHP:Int){
        if (increasedHP <= 0)return
        healthy = Math.min(maxHP,healthy+increasedHP)
    }

    fun takeDamage(damage: Damage){
        var resistanceForDamage = resistance.getResistanceForDamage(damage)
        decreaseHP(Math.min(0,damage.damage - resistanceForDamage))
    }

    fun addStatus(status: Status){
        var find = currentStatus.find { it.javaClass == status.javaClass }
        if (find != null){
            find.inCreateLayer()
        }else{
            currentStatus.add(status)
            status.attach(this)
            status.inCreateLayer()
        }
    }

    fun removeStatus(status: Status){
        currentStatus.filter { it.javaClass == status.javaClass }.forEach {
            it.disAttach()
            currentStatus.remove(it)
        }
    }
}