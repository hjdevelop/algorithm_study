class Solution {
    fun solution(s: String): IntArray {
        val answer = mutableListOf<Int>()
        
        for (i in 0 until s.length) {
            if (i == s.indexOf(s[i])) answer.add(-1)
            else {
                for (j in i - 1 downTo 0) {
                    if (s[j] == s[i]) {
                        answer.add(i - j)
                        break
                    }
                }
            }
        }
        return answer.toIntArray()
    }
}