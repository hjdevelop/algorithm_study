class Solution {
    fun solution(start: Int, end: Int): IntArray {
        val answer = mutableListOf<Int>()
        var temp = start 
        for(i in end..start) {
            answer.add(temp--)
        }
        return answer.toIntArray()
    }
}