class Solution {
    fun solution(num_list: IntArray): IntArray {
        val list = num_list.toMutableList()
        if (list[list.lastIndex] > list[list.size - 2]) list.add(list[list.lastIndex] - list[list.size - 2])
        else list.add(list[list.lastIndex] * 2)
        
        return list.toIntArray()
    }
}