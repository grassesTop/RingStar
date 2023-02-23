package grasses.top.comb.control

/**
 * 玩家账号
 */
interface Account {
    fun logout()
    fun startBattle()
    fun stopBattle()
    fun resumeBattle()
    fun pauseBattle()
}