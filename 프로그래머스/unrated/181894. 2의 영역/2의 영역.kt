class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        
        when (arr.count { it == 2 }) {
            0 -> answer.add(-1)
            1 -> answer.add(2)
            else -> {
                val listTwo = arr.indices.filter { arr[it] == 2 }
                answer.addAll(arr.sliceArray(listTwo.first()..listTwo.last()).toList())
            }
        }
        return answer.toIntArray()
    }
}