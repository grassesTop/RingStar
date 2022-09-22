package grasses.top.comb.user

import grasses.top.comb.base.Status
import grasses.top.comb.status.ToughnessStatus

/**
 * 种族
 */
open class Race(var raceNum : Int) {
    companion object{
        //未知
        const val UnKnow = 0
        //人族
        const val Human = 1 shl 1
        //天使族
        const val Angel = 1 shl 2
        //魔鬼
        const val Devil = 1 shl 3
        //恶魔
        const val Demons= 1 shl 4
        //地精
        const val Goblin = 1 shl 5
        //精灵
        const val Spirit = 1 shl 6
        //龙族
        const val Dragon = 1 shl 7
        //幻龙族
        const val Loong = 1 shl 8
        //机械族
        const val Mechanical  = 1 shl 9
        //娜迦族
        const val Naga = 1 shl 10
        //兽人族
        const val Orc = 1 shl 11
        //亡灵族
        const val Undead = 1 shl 12
        //神族
        const val Protoss = 1 shl 13
        //元素生物
        const val Element = 1 shl 14
    }

    fun getRaceStatus():ArrayList<Status>{
        var list = arrayListOf<Status>()
        if (raceNum and Human == Human){
            list.add(ToughnessStatus())
        }else if (raceNum and Angel == Angel){

        }
        return list
    }

}