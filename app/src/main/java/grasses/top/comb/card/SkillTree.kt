package grasses.top.comb.card


/**
 * 技能树 db
 */
class SkillTree {
    val skillS = ArrayList<SkillDB>()
    init {
        addLightSkillDB()
        addDarkSkillDB()
        addEarthSkillDB()
        addWaterSkillDB()
        addWindSkillDB()
        addFireSkillDB()
        addElectricSkillDB()
        addWoodSkillDB()
        addMetalSkillDB()
        addSpaceSkillDB()
        addNoneSkillDB()
        addTimeSkillDB()
        addSpiritSkillDB()
    }

    private fun addLightSkillDB() {
        skillS.add(SkillDB("照明术",true))
        skillS.add(SkillDB("大预言术",true))
        skillS.add(SkillDB("预言术",true))
        skillS.add(SkillDB("驱散",true))
        skillS.add(SkillDB("圣盾",true))
        skillS.add(SkillDB("天启"))
        skillS.add(SkillDB("天使降临"))
        skillS.add(SkillDB("焚烧"))
        skillS.add(SkillDB("幸运术"))
    }

    private fun addDarkSkillDB(){
        skillS.add(SkillDB("潜行"))
        skillS.add(SkillDB("隐藏"))
        skillS.add(SkillDB("黑暗降临"))
        skillS.add(SkillDB("诅咒"))
        skillS.add(SkillDB("中毒"))
        skillS.add(SkillDB("召唤亡灵"))
        skillS.add(SkillDB("亡灵大军"))
        skillS.add(SkillDB("死亡骑士"))
        skillS.add(SkillDB("死亡一指"))
        skillS.add(SkillDB("废墟"))
        skillS.add(SkillDB("腐朽"))
        skillS.add(SkillDB("堕落天使"))
        skillS.add(SkillDB("堕落"))
        skillS.add(SkillDB("亵渎"))
        skillS.add(SkillDB("不死鸟"))
        skillS.add(SkillDB("不灭火"))
        skillS.add(SkillDB("复生"))
        skillS.add(SkillDB("夺舍"))
        skillS.add(SkillDB("厄运术"))
    }

    private fun addEarthSkillDB(){
        skillS.add(SkillDB("地震术"))
        skillS.add(SkillDB("石墙"))
        skillS.add(SkillDB("岩浆"))
        skillS.add(SkillDB("陨石术",true))
        skillS.add(SkillDB("尘埃"))
        skillS.add(SkillDB("埋葬"))
        skillS.add(SkillDB("十倍重力"))
        skillS.add(SkillDB("重力失效"))
        skillS.add(SkillDB("火山喷发"))
        skillS.add(SkillDB("流星雨"))
        skillS.add(SkillDB("石肤术",true))
    }

    private fun addWaterSkillDB(){
        skillS.add(SkillDB("治愈术"))
        skillS.add(SkillDB("水弹术"))
        skillS.add(SkillDB("血液吸取"))
        skillS.add(SkillDB("冻结"))
        skillS.add(SkillDB("冰河世纪"))
        skillS.add(SkillDB("暴风雨"))
        skillS.add(SkillDB("暴风雪"))
        skillS.add(SkillDB("冰盾"))
        skillS.add(SkillDB("净化"))
        skillS.add(SkillDB("中毒"))
        skillS.add(SkillDB("降雨"))
        skillS.add(SkillDB("下雪"))
        skillS.add(SkillDB("水龙卷"))
        skillS.add(SkillDB("泥石流"))
        skillS.add(SkillDB("成长液"))
        skillS.add(SkillDB("明镜止水"))
        skillS.add(SkillDB("大雾弥漫"))
        skillS.add(SkillDB("水牢术"))
    }

    private fun addWindSkillDB(){
        skillS.add(SkillDB("龙卷风"))
        skillS.add(SkillDB("风刃"))
        skillS.add(SkillDB("吹散"))
        skillS.add(SkillDB("龙卷风"))
        skillS.add(SkillDB("火龙卷风"))
        skillS.add(SkillDB("水龙卷风"))
        skillS.add(SkillDB("凌空"))
        skillS.add(SkillDB("加速"))
        skillS.add(SkillDB("减速"))
        skillS.add(SkillDB("上升气流"))
        skillS.add(SkillDB("暴风"))
    }

    private fun addFireSkillDB(){
        skillS.add(SkillDB("火球术"))
        skillS.add(SkillDB("大火球术"))
        skillS.add(SkillDB("火龙卷"))
        skillS.add(SkillDB("三昧真火"))
        skillS.add(SkillDB("高温"))
        skillS.add(SkillDB("召唤火元素"))
        skillS.add(SkillDB("龙息"))
        skillS.add(SkillDB("亢奋"))
        skillS.add(SkillDB("活化"))
        skillS.add(SkillDB("活化"))
        skillS.add(SkillDB("火墙"))
    }

    private fun addElectricSkillDB(){
        skillS.add(SkillDB("闪电链"))
        skillS.add(SkillDB("五雷轰顶"))
        skillS.add(SkillDB("等离子炮"))
        skillS.add(SkillDB("雷遁"))
        skillS.add(SkillDB("活化"))
        skillS.add(SkillDB("麻痹"))
        skillS.add(SkillDB("雷达扫描"))
    }

    private fun addWoodSkillDB(){
        skillS.add(SkillDB("生长术"))
        skillS.add(SkillDB("枯萎"))
        skillS.add(SkillDB("召唤树人"))
        skillS.add(SkillDB("木盾"))
        skillS.add(SkillDB("木铠"))
        skillS.add(SkillDB("彼岸花"))
        skillS.add(SkillDB("世界树"))
        skillS.add(SkillDB("桃木剑"))
    }

    private fun addMetalSkillDB(){
        skillS.add(SkillDB("金属铠甲"))
        skillS.add(SkillDB("铁剑"))
        skillS.add(SkillDB("铁刀"))
        skillS.add(SkillDB("铁斧头"))
        skillS.add(SkillDB("剑阵"))
        skillS.add(SkillDB("剑雨"))
        skillS.add(SkillDB("高达"))

    }

    private fun addSpiritSkillDB(){
        skillS.add(SkillDB("精神攻击"))
        skillS.add(SkillDB("变羊术"))
        skillS.add(SkillDB("灵魂撕裂"))
        skillS.add(SkillDB("精神防御"))
        skillS.add(SkillDB("真实中的虚幻"))
        skillS.add(SkillDB("虚幻中的真实"))
        skillS.add(SkillDB("幻想国度"))
        skillS.add(SkillDB("心魔"))
        skillS.add(SkillDB("美杜莎之眼"))
        skillS.add(SkillDB("魅惑"))
    }

    private fun addNoneSkillDB(){
        skillS.add(SkillDB("元素转换"))
        skillS.add(SkillDB("能量回复"))
    }

    private fun addSpaceSkillDB(){
        skillS.add(SkillDB("随机传送"))
        skillS.add(SkillDB("空间折叠"))
        skillS.add(SkillDB("空间泯灭"))
        skillS.add(SkillDB("传送门"))
        skillS.add(SkillDB("位面传送"))
        skillS.add(SkillDB("位面传送"))
        skillS.add(SkillDB("异世界召唤"))
        skillS.add(SkillDB("小位面"))
    }

    private fun addTimeSkillDB(){
        skillS.add(SkillDB("时间加速"))
        skillS.add(SkillDB("时间减速"))
        skillS.add(SkillDB("时间停止"))
        skillS.add(SkillDB("时间轮回"))
        skillS.add(SkillDB("时间分身"))
    }


    data class SkillDB(val name:String,val impl:Boolean = false)

}