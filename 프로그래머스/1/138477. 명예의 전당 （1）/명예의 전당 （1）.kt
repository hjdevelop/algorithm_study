class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        
        for (i in 0 until score.size) {
            if (i in 0..k - 1) {
                answer.add(score.sliceArray(0..i).minOf { it })
            }
            else {
                answer.add(score.sliceArray(0..i).sortedDescending()[k - 1])
            }
        }
        return answer.toIntArray()
    }
}