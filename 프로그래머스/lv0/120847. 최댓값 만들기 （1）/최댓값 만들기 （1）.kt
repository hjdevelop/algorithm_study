class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        var maxNum: Int = 0
        for(i in 0..numbers.size - 1) {
            for(j in i + 1..numbers.size - 1) {
                if(maxNum < numbers[i] * numbers[j]) {
                    maxNum = numbers[i] * numbers[j]
                }
            }
        }
        answer = maxNum
        return answer
    }
}