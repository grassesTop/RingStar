package grasses.top.comb.control

interface Status {
    fun attach(owner: StatusOwner) : Boolean
    fun disAttach(owner: StatusOwner) : Boolean
    fun effect()
    fun registerStatusChangedCallback(callback: OnStatusChangedCallback)
    fun disperse():Boolean
}

interface OnStatusChangedCallback{
    fun onAttach()
    fun onDisAttach()
    fun onEffect()
}

/**
 * 战斗开始时生效状态
 */
interface BattleStatus:Status ,BattleLife {

}


/**
 * 回合数状态
 */
interface TurnStatus:Status,TurnLife {
    //剩余持续回合数
    fun getLastTurns():Int
    fun addTurn(turn:Int):Boolean
    fun removeTurn(turn: Int):Boolean
}