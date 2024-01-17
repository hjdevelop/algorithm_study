class Solution {
    fun solution(arr: Array<IntArray>): Array<IntArray> {
        var array = mutableListOf<MutableList<Int>>()
        arr.forEach { array.add(it.toMutableList()) }
        
        if (arr.size > arr[0].size) {
            for (i in 0 until arr.size - arr[0].size) {
                array.forEach { it.add(0) }
            }
        }
        else if (arr.size < arr[0].size) {
            for (i in 0 until arr[0].size - arr.size) {
                array.add(MutableList<Int>(arr[0].size) { 0 })
            }
        }
        val answer = array.map { it.toIntArray() }.toTypedArray()
        return answer
    }
}