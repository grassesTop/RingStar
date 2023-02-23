package grasses.top.comb.status

import grasses.top.comb.base.Status
import grasses.top.comb.user.Resistance

class ResistanceChangeStatus() : Status() {
    var changeResistance : Resistance.ResistanceData? = null
    init {

    }

    override fun getOffsetResistance(): Resistance.ResistanceData? {
        return changeResistance
    }

}