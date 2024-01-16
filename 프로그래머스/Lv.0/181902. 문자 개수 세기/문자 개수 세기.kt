class Solution {
    fun solution(my_string: String): IntArray {
        var answer: IntArray = IntArray(52)
        
        for (i in 65..90) {
            answer[i - 65] = my_string.count { it.code == i }
        }
        for (i in 97..122) {
            answer[i - 71] = my_string.count { it.code == i }
        }
        return answer
    }
}