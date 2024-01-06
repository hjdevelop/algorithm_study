class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        var answer = mutableListOf<Int>()
        
        for (i in intStrs) {
            val overK = i.substring(s, s + l).toInt()
            if (overK > k) answer.add(overK)
        }
        return answer.toIntArray()
    }
}