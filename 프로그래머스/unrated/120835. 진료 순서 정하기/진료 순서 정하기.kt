class Solution {
    fun solution(emergency: IntArray): IntArray {
        var array = emergency.copyOf().sortedDescending()
        val answer = mutableListOf<Int>()
        
        for (i in 0 until array.size) {
            answer.add(array.indexOf(emergency[i]) + 1)
        }
        return answer.toIntArray()
    }
}