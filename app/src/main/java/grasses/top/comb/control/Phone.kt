package grasses.top.comb.control

/**
 * 手机操作
 */
interface Phone {
    fun login(name:String,pwd:String):Account
    fun register():Account
}