class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var temp: Double = num1.toDouble() / num2.toDouble() * 1000
        var answer: Int = temp.toInt()
        return answer
    }
}