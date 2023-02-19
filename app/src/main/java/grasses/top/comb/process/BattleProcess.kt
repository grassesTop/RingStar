package grasses.top.comb.process

import android.util.Log
import grasses.top.comb.base.Player
import grasses.top.comb.base.Terrain
import grasses.top.comb.base.User

/**
 * 战斗流程
 */
class BattleProcess(var uses:ArrayList<User>, var terrain : Terrain, var player: ArrayList<Player>) {
    var isBattling = true
    private val TAG = BattleProcess::class.simpleName
    var historyTurn:ArrayList<Turn> = arrayListOf()

    fun start(){
        terrain.onBattleStart(this)
        uses.forEach {
            it.onBattleStart(this)
        }
        var turn = Turn(this)
        historyTurn.add(turn)
        Thread{
            while (isBattling){
                turn = historyTurn.last()
                turn.start()
                turn.choiceCardStart()
                turn.effectSkill()
                turn.end()
                if (isBattling){
                    historyTurn.add(Turn(this))
                }
            }
        }.start()
    }

    fun end(){
        if (isBattling){
            terrain.onBattleEnd()
            isBattling = false
            val turn = historyTurn.last()
            turn.end()
            uses.forEach { it.onBattleEnd() }
            Log.d(TAG,"战斗结束")
        }
    }

}