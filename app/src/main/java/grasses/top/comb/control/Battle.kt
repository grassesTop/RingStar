package grasses.top.comb.control

interface BattleLife {
    fun startBattle(battle: Battle)
    fun stopBattle(battle: Battle)
    fun pauseBattle(battle: Battle)
    fun resumeBattle(battle: Battle)
}

interface Battle {

}