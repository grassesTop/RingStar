package grasses.top.comb.base

/**
 * 物件,所有能发生元素反应的物体,比如人,树,地表,空气,水,火,机械,城墙等.
 */
open class Substance {
    var name = ""
    var isDismiss = false
    fun mergeSubstances(existSubstances:ArrayList<Substance>):ArrayList<Substance>{
        val createdSubstance = arrayListOf<Substance>()
        for (substance in existSubstances) {
            if (isDismiss)break
            if (substance.isDismiss){
                continue
            }
            //自身元素被反应
            mergeSubstance(substance)?.let {
                createdSubstance.add(it)
            }
            if (isDismiss){
                //反应的是双向的,如果本身消失了,需要单独调用
                //单独调用摄入元素的反应函数
                substance.mergeSubstance(this)?.let {
                    createdSubstance.add(it)
                }
            }
        }
        return createdSubstance
    }
    open fun mergeSubstance(substance: Substance):Substance?{
        return null
    }


    /**
     * 消失
     */
    fun dismiss(){
        isDismiss = true
    }
}