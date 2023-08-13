class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var a: Int = 0
        while(true) {
            if(a % 2 == 1) {
                answer = answer.plus(a)
            }
            if(a == n) {
                break
            }
            a++
        }
        return answer
    }
}