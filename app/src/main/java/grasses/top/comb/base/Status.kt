package grasses.top.comb.base

import grasses.top.comb.process.BattleLife
import grasses.top.comb.process.TurnLife
import grasses.top.comb.thing.OrganicSubstance
import grasses.top.comb.user.Resistance

/**
 * 人物,物品上的状态
 */
abstract class Status : BattleLife ,TurnLife {
    var name = ""
    /**
     * 状态的等级,某些低等级技能效果无法影响高等级的效果
     */
    var grade = 0
    /**
     * 是否展示战斗图标
     */
    var isShowBattleIcon = true
    var description = ""
    var organicSubstance : OrganicSubstance? = null
    abstract fun inCreateLayer()
    abstract fun disCreateLayer()
    open fun attach(user: OrganicSubstance){
        this.organicSubstance = user
    }
    open fun disAttach(){
        this.organicSubstance?.currentStatus?.remove(this)
        this.organicSubstance = null
    }

    open fun relevant(status : Status):Int{
        return Resistance.RELEVANT_NONE
    }

    open fun getOffsetResistance():Resistance.ResistanceData?{
        return null
    }
}