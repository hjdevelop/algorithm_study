class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var temp: Int = 1
        if(num_list.size >= 11) {
            for(i in num_list) {
                answer += i
            }
        }
        else {
            for(i in num_list) {
                temp *= i
            }
            answer = temp
        }
        return answer
    }
}