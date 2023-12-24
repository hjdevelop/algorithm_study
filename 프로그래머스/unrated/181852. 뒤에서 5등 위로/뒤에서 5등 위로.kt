class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        num_list.sort()
        return num_list.slice(5..num_list.lastIndex).toIntArray()
    }
}