class Solution {
    fun solution(n_str: String): Int {
        var answer: Int = 0
        for(i in 0..n_str.length - 1) {
            answer *= 10
            answer += n_str[i].digitToInt()
        }
        return answer
    }
}