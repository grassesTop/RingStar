package grasses.top.comb.control

interface Speller {
    fun getSpellSpeed():Int
    fun increaseSpellSpeed(speed:Int):Boolean
    fun reduceSpellSpeed(speed: Int):Boolean
    fun spell(card: Card):Boolean
    fun registerSpellStateCallback(callback: SpellStateCallback)
}
interface SpellStateCallback{
    fun onSpellStart()
    fun onSpellEnd()
    fun onSpellInterruption()
}