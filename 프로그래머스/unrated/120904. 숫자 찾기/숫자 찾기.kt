class Solution {
    fun solution(num: Int, k: Int): Int {
        var answer: Int = -1
        
        for ((index, i) in num.toString().withIndex()) {
            if (i.digitToInt() == k) {
                answer = index + 1
                break
            }
        }
        return answer
    }
}