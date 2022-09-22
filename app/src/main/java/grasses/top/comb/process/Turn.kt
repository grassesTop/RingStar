package grasses.top.comb.process

import grasses.top.comb.base.BattleProcess
import grasses.top.comb.card.CardNode

/**
 * 回合阶段,开始->玩家操作->玩家操作结束->结束
 */
class Turn(var battleProcess: BattleProcess){
    var isEnd = false
    /**
     * reset角色的一些回合制相关的属性
     */
    fun start(){
        if (isEnd){
            return
        }
        battleProcess.terrain.onTurnStart(this)
        battleProcess.uses.forEach { 
            it.onTurnStart(this)
        }
    }
    /**
     * 玩家指定角色按照一定顺序释放技能
     */
    fun choiceCardStart(){
        if (isEnd){
            return
        }
        battleProcess.terrain.onTurnChoiceCardStart()
        battleProcess.uses.forEach {
            it.onTurnChoiceCardStart()
        }
    }

    /**
     * 角色释放技能,判断是否快速释放还是正常施法释放
     */
    fun effectSkill(){
        if (isEnd){
            return
        }
        battleProcess.terrain.onTurnEffectSkill()
        battleProcess.uses.forEach {
            it.onTurnEffectSkill()
        }
    }
    fun end(){
        isEnd = true
        battleProcess.terrain.onTurnEnd()
        battleProcess.uses.forEach {
            it.onTurnEnd()
        }
    }


}