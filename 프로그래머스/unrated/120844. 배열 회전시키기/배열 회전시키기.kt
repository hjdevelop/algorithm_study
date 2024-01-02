import java.util.Collections

class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        val list = numbers.toMutableList()
        
        if (direction == "right") {
            list.add(0, list[list.lastIndex])
            list.removeAt(list.lastIndex)
        } else {
            list.add(numbers[0])
            list.removeAt(0)
        }
        
        return list.toIntArray()
    }
}