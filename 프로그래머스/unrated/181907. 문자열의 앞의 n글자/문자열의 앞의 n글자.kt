class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
        for(i in 0..n - 1) {
            answer = answer.plus(my_string[i])
        }
        return answer
    }
}