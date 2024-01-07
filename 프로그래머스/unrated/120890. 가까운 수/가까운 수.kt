import java.util.*
import kotlin.math.abs

class Solution {
    fun solution(array: IntArray, n: Int): Int {
        val absArray = array.sorted().map { abs(it - n) }
        
        return array.sorted()[absArray.indexOf(absArray.toIntArray().minOf { it })]
    }
}