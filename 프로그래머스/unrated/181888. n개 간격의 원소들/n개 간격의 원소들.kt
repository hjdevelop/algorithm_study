class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in 0..num_list.size - 1 step(n)) {
            answer = answer.plus(num_list[i])
        }
        return answer
    }
}