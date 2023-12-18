class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        val num1 = (a.toString() + b.toString()).toInt()
        val num2 = (b.toString() + a.toString()).toInt()
        if (num1 >= num2) {
            answer = num1
        }
        else {
            answer = num2
        }
        return answer
    }
}