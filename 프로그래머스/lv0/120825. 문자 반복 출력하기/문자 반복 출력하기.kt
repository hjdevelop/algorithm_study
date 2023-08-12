class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
        for(i in 0..my_string.length - 1) {
            for(j in 1..n) {
                answer = answer + my_string[i]
            }
        }
        return answer
    }
}