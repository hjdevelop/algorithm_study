class Solution {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        var answer = mutableListOf<Int>()
        
        for (i in 0 until flag.size) {
            if (flag[i] == true) {
                for (j in 0 until arr[i] * 2) {
                    answer.add(arr[i])
                }
            }
            else {
                for (k in 0 until arr[i]) {
                    answer.removeAt(answer.lastIndex)
                }
            }
        }
        return answer.toIntArray()
    }
}