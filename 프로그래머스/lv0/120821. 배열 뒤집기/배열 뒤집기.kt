class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in num_list.reversed()) {
            answer = answer.plus(i)
        }
        return answer
    }
}