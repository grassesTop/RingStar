package grasses.top.comb.control

import grasses.top.comb.base.BaseElement

/**
 * 能量持有者
 */
interface ElementOwner {
    fun getHoldElements():List<BaseElement>
    fun increaseElement(element: BaseElement)
    fun reduceElement(element: BaseElement)
    fun useElement(list: List<BaseElement>)
    fun dropElement(list: List<BaseElement>)
    fun registerElementChangedCallback(callback:OnElementChangedCallback)
}
interface OnElementChangedCallback{
    fun onElementIncrease(element: BaseElement)
    fun onElementReduce(element: BaseElement)
    fun onElementUse(list: List<BaseElement>)
}