package grasses.top.comb.process

import grasses.top.comb.base.BattleProcess

interface BattleLife {
    fun onBattleStart(battleProcess: BattleProcess)
    fun onBattleEnd()
}