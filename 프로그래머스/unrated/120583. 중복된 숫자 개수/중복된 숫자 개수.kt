class Solution {
    fun solution(array: IntArray, n: Int): Int = array.filter {it.toInt() == n}.size
}