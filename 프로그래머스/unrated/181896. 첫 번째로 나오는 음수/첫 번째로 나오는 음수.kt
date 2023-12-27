class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = -1
        
        for ((index, i) in num_list.withIndex()) {
            if (i < 0) {
                answer = index
                break
            }
            
        }
        return answer
    }
}