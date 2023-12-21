class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0
        for (i in s1) {
            answer += s2.count {it == i}
        }
        return answer
    }
}