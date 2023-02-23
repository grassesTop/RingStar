package grasses.top.comb.control

/**
 * 生命条
 */
interface Health {
    fun getMaxHealth():Int
    fun getRemainHealth():Int
    fun reply(health:Int)
    fun lose(health: Int)
    fun death()
    fun registerCallback(callback: OnHealthStateChangedCallback)
}
interface OnHealthStateChangedCallback {
    fun onHealthReply(health:Int)
    fun onHealthLose(health:Int)
    fun onDeath()
}