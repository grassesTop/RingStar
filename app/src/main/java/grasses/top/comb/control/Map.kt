package grasses.top.comb.control

import android.graphics.Path

/**
 * 地图
 */
interface Map {
    /**
     * 获得地图上的所有角色
     */
    fun getAllCharacters():ArrayList<Character>
    /**
     * 获得指定范围内的角色
     */
    fun getBoundCharacters(path:Path):ArrayList<Character>
    /**
     * 获得当前地图上的环境状态
     */
    fun getStatus():Status
}