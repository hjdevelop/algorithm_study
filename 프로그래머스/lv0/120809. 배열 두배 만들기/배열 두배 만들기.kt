class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        for(i in 0 until numbers.size) {
            answer = answer.plus(numbers[i] * 2)
        }
        return answer
    }
}