import kotlin.math.abs

class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        if (a % 2 == 1 && b % 2 == 1) answer = a * a + b * b
        else if (a % 2 == 1 || b % 2 == 1) answer = 2 * (a + b)
        else answer = abs(a - b)
        return answer
    }
}