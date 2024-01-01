class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = -100000000
        for (i in 0 until numbers.size) {
            for (j in i + 1 until numbers.size) {
                if (numbers[i] * numbers[j] > answer) answer = numbers[i] * numbers[j]
             }
         }
        return answer
    }
}