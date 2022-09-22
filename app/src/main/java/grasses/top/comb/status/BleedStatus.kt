package grasses.top.comb.status

import grasses.top.comb.base.BattleProcess
import grasses.top.comb.base.Status
import grasses.top.comb.process.Turn

/**
 * 流血,回合结束时造成伤害,伤害为 1+2+3+...+ n-1 + n.每次造成伤害后,层数减一
 */
class BleedStatus():Status() {
    var layer = 0
    override fun inCreateLayer() {
        layer++
    }

    override fun disCreateLayer() {
        layer = Math.max(0,layer - 1)
        if (layer == 0){
            organicSubstance?.removeStatus(this)
        }
    }

    override fun onBattleStart(battleProcess: BattleProcess) {

    }

    override fun onBattleEnd() {

    }

    override fun onTurnStart(turn: Turn) {

    }

    override fun onTurnChoiceCardStart() {

    }

    override fun onTurnEffectSkill() {

    }

    override fun onTurnEnd() {
        var bleedDamage = (1 + layer) * layer / 2
        organicSubstance?.decreaseHP(bleedDamage)
        disCreateLayer()
    }

}