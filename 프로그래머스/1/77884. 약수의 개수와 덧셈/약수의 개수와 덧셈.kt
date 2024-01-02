import kotlin.math.sqrt

class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        
        for (i in left..right) {
            val sqrt = sqrt(i.toDouble()).toLong()
            if (sqrt * sqrt == i.toLong()) answer -= i
            else answer += i
        }
        return answer
    }
}