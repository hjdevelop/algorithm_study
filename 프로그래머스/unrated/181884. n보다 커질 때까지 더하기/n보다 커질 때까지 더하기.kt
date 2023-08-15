class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        var answer: Int = 0
        var i: Int = 0
        while(true) {
            answer += numbers[i]
            if(answer > n) {
                break
            }
            else {
                i++
                continue
            }
        }
        return answer
    }
}