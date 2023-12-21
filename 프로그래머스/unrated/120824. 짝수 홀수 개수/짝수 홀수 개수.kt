class Solution {
    fun solution(num_list: IntArray): IntArray {
        val even = num_list.count {it % 2 == 0}
        val odd = num_list.count {it % 2 != 0}
        var answer: IntArray = intArrayOf(even, odd)
        return answer
    }
}