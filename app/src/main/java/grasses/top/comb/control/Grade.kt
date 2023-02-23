package grasses.top.comb.control

/**
 * 拥有阶级功能,可以增加阶级,减少阶级,
 * 阶级最高到5,最低到1,
 */
interface Grade {
    fun increaseGrade()
    fun reduceGrade()
    fun registerGradeChange(callback:OnGradeChangedCallback)
}
interface OnGradeChangedCallback {
    fun onGradeIncrease(inCreasedGrade:Int)
    fun onGradeReduce(reducedGrade:Int)
}