class Solution {
    fun solution(start: Int, end: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var a: Int = start
        while(true) {
            answer = answer.plus(a)
            if(a == end) {
                break
            }
            a++
        }
        return answer
    }
}