class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        var sum: Int = 0
        
        for (i in tangerine.groupBy { it }.map { it.value.count() }.sortedDescending()) {
            sum += i
            answer++
            if (sum >= k) break
        }
        return answer
    }
}