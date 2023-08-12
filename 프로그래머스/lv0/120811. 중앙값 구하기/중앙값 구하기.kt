class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        var temp: Int = 0
        for(i in 0..array.size - 1) {
            for(j in i+1..array.size - 1) {
                if(array[i] > array[j]) {
                    temp = array[i]
                    array[i] = array[j]
                    array[j] = temp
                }
            }
        }
        answer = array[array.size / 2]
        return answer
    }
}