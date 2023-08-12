class Solution {
    fun solution(numbers: IntArray, num1: Int, num2: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        for(i in numbers.slice(num1..num2)) {
            answer = answer.plus(i)
        }
        return answer
    }
}