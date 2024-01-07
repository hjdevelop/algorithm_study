class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = arr.toMutableList()
        var targetLength = 1
        
        while (targetLength < answer.size) {
            targetLength *= 2
        }
        
        for (i in 0 until targetLength - answer.size) {
            answer.add(0)
        }
        return answer.toIntArray()
    }
}