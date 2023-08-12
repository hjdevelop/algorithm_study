class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var even: Int = 0
        var odd: Int = 0
        for (i in num_list) {
            if(i % 2 == 0) {
                even++
            }
            else {
                odd++
            }
        }
        answer = answer.plus(even)
        answer = answer.plus(odd)
        return answer
    }
}