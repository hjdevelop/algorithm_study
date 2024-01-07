class Solution {
    fun solution(i: Int, j: Int, k: Int): Int = (i..j).map { it }.joinToString("").count { it.digitToInt() == k }
}