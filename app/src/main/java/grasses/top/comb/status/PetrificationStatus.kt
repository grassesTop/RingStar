package grasses.top.comb.status

import grasses.top.comb.base.BattleProcess
import grasses.top.comb.base.Status
import grasses.top.comb.process.Turn
import grasses.top.comb.thing.OrganicSubstance
import grasses.top.comb.user.Resistance

class PetrificationStatus:Status() {
    init {
        name = "石化"
        description = "免疫流血状态,增加割裂抗性一点,无法操作"
    }

    override fun relevant(status: Status): Int {
        if (status is BleedStatus){
            return Resistance.RELEVANT_IMMUNE
        }else{
            return super.relevant(status)
        }
    }

    override fun getOffsetResistance(): Resistance.ResistanceData {
        return Resistance.ResistanceData(splitResistance = 1)
    }

    override fun inCreateLayer() {

    }

    override fun disCreateLayer() {
        TODO("Not yet implemented")
    }

    override fun onBattleStart(battleProcess: BattleProcess) {
        TODO("Not yet implemented")
    }

    override fun onBattleEnd() {
        TODO("Not yet implemented")
    }

    override fun onTurnStart(turn: Turn) {
        TODO("Not yet implemented")
    }

    override fun onTurnChoiceCardStart() {
        TODO("Not yet implemented")
    }

    override fun onTurnEffectSkill() {
        TODO("Not yet implemented")
    }

    override fun onTurnEnd() {
        TODO("Not yet implemented")
    }
}