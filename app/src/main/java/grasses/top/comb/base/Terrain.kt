package grasses.top.comb.base

import grasses.top.comb.process.BattleLife
import grasses.top.comb.process.BattleProcess
import grasses.top.comb.process.Turn
import grasses.top.comb.process.TurnLife

class Terrain :BattleLife,TurnLife{
    var weather : Weather? = null
    var battleProcess : BattleProcess? = null
    var width = 1000
    var height = 1000
    var allSubstance = arrayListOf<Substance>()
    override fun onBattleStart(battleProcess: BattleProcess) {
        this.battleProcess = battleProcess
    }

    override fun onBattleEnd() {

    }

    override fun onTurnStart(turn: Turn) {
        allSubstance.filter {
            it is TurnLife
        }.map { it as TurnLife }.forEach {
            it.onTurnStart(turn)
        }
    }

    override fun onTurnChoiceCardStart() {

    }

    override fun onTurnEffectSkill() {

    }

    override fun onTurnEnd() {
        allSubstance.filter {
            it is TurnLife
        }.map { it as TurnLife }.forEach {
            it.onTurnEnd()
        }
    }
}