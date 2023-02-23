package grasses.top.comb.control

/**
 * 技能
 */
interface Card:Thing,Grade {
    fun getSpellTime():Int
    fun effect(speller: Speller):Boolean
}

/**
 * 直线指向型
 */
interface SensingCard:Card{
    fun setDirection()
    fun setSpeed()
    fun deflection()
    fun onStop()
}


/**
 * 选中型技能
 */
interface SelectChard:Card{
    fun getSelectNum():Int
}

/**
 * 选中角色
 */
interface SelectCharacterCard:SelectChard{
    fun setSelectCharacters(characters:List<Character>)
}

/**
 * 选中活物
 */
interface SelectLivingCard:SelectChard{
    fun setSelectLivings()
}

/**
 * 选中区域
 */
interface SelectAreaCard:SelectChard{
    fun setAreas()
}

/**
 * 选中方向
 */
interface SelectDirectionCard:SelectChard{
    fun setDirections()
}