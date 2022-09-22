package grasses.top.comb.process

interface TurnLife {
    fun onTurnStart(turn: Turn)
    fun onTurnChoiceCardStart()
    fun onTurnEffectSkill()
    fun onTurnEnd()
}