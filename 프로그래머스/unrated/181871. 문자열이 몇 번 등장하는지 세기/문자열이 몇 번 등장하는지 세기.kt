class Solution {
    fun solution(myString: String, pat: String): Int {
        var answer: Int = 0
        
        for (i in 0 until myString.length - pat.length + 1) {
            if (myString[i] == pat[0]) {
                var ins = true
                for (j in 0 until pat.length) {
                    if (myString[i + j] != pat[j]) ins = false
                }
                if (ins == true) answer++
            }
        }
        return answer
    }
}