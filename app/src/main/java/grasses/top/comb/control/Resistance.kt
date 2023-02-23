package grasses.top.comb.control

import grasses.top.comb.user.Resistance

/**
 * 抗性持有者
 */
interface ResistanceOwner {
    fun getResistance() : Resistance.ResistanceData
    fun increaseResistance(resistance:Resistance.ResistanceData)
    fun reduceResistance(resistance:Resistance.ResistanceData)
}