package grasses.top.comb.control

import grasses.top.comb.base.Status

/**
 * 状态持有者
 */
interface StatusOwner {
    fun getCurrentStatus() : List<Status>
    fun addStatus(status: Status)
    fun removeStatus(status: Status)
    fun registerStatusChangedCallback(callback: StatusChangedCallback)
}
interface StatusChangedCallback{
    fun onStatusRemoved(status: Status)
    fun onStatusAdded(status: Status)
}