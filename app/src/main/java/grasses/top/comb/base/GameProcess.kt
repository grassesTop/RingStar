package grasses.top.comb.base

/**
 * 游戏流程
 */
class GameProcess {
    var battleProcess : BattleProcess? = null
    /**
     * 进入战斗
     */
    fun enterBattle(){
        battleProcess?.start()
    }
    /**
     * 战斗结束
     */
    fun outBattle(){
        battleProcess?.end()
    }

    fun start(){}
    fun end(){}
}