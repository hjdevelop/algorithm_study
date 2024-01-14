class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int = IntArray(included.size) { a + it * d }.filterIndexed { index, _ -> included[index] == true }.sum()
}