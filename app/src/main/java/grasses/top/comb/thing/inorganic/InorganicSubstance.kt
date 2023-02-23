package grasses.top.comb.thing.inorganic

import grasses.top.comb.base.Substance

/**
 * 无机物,水,火,等没有生命条的物体
 */
open class InorganicSubstance: Substance() {
    /**
     * todo 传递相邻的
     */
    fun transmitNearby():ArrayList<Substance>?{
        return null
    }
    /**
     * todo 传递所有连接的
     */
    fun transmitSameSubstance():ArrayList<Substance>?{
        return null
    }




}