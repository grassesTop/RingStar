package grasses.top.comb.base

const val BaseElementCount = 9
enum class BaseElement(var elementName : String,var index : Int) {
    None("无",0),
    Metal("金",1),
    Wood("木",2),
    Water("水",3),
    Fire("火",4),
    Earth("土",5),
    Wind("风",6),
    Electric("电",7),
    Light("光",8),
    Dark("暗",9),
    Spirit("精神",10),
    Space("空间",11),
    Time("时间",12),
}

/**
 * 假设 1:
 * 分为实体和能量体.
 * 实体表示地,水,火,等需要在地图上直接显示出来的
 * 能量体表示baseElement ,用户释放的能量
 * 于是 实体+能量=另一种实体
 *
 * 假设2 :技能释放时,会有对应的能量释放出去.
 * 案例:
 * 地上的火,用户使用包含水能量的技能,水+火=雾气
 *
 * 假设3: 技能释放时,会有对应的实体释放出去
 * 地上的火,用户使用技能包含水,水+火=雾气
 *
 * 假设4: 两个元素的反应是分开的,需要执行两次.比如水不和木头反应,但是木头和水反应.
 *
 * 假设5: 多元素反应顺序
 * 比如同时存在水,木,火,电.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
