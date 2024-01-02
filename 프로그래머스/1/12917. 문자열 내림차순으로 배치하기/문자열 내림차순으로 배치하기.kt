class Solution {
    fun solution(s: String): String {
        var answer = s.toCharArray()
        
        for (i in 0 until answer.size) {
            for (j in i until answer.size) {
                if (answer[i] < answer[j]) {
                    val temp = answer[i]
                    answer[i] = answer[j]
                    answer[j] = temp
                }
            }
        }
        return String(answer)
    }
}