package grasses.top.comb.base

import java.lang.StringBuilder

open class Card() {
    companion object {
        val sAllCards = HashMap<String,Class<out Card>>()
    }

    var name = ""

    /**
     * 某些法术需要等级判断
     */
    var star = 0
    var description = ""
    var formula : ArrayList<BaseElement> = arrayListOf()
    var spellDuration = 20
    var elementSeries = BaseElement.None
    var speller : User? = null


    /**
     * 返回一个字符串,每个位置表示对应属性的数量,新增的元素放在最后面
     */
    val formulaString:String by lazy{
        var formulaSb = StringBuilder()
        repeat(BaseElementCount){ index->
            formulaSb.append(formula.count { it.index == index })
        }
        formulaSb.toString()
    }

    /**
     * 升级
     */
    open fun upgrade(element: BaseElement):Card?{
        return null
    }

    /**
     * 近身,远程,读条,持续,被动,buff,
     */
    var type = 0

    constructor(name: String) :this (){
        this.name = name
    }

    constructor(
        name: String,
        star: Int,
        description: String,
        formula: ArrayList<BaseElement>,
        spellDuration: Int,
        elementSeries: BaseElement,
        speller: User?,
        type: Int
    ) : this() {
        this.name = name
        this.star = star
        this.description = description
        this.formula = formula
        this.spellDuration = spellDuration
        this.elementSeries = elementSeries
        this.speller = speller
        this.type = type
    }


    /**
     * 释放法术
     */
    open fun spell(spellDuration:Int){

    }

    /**
     * 造成影响
     */
    open fun effect(){

    }


}