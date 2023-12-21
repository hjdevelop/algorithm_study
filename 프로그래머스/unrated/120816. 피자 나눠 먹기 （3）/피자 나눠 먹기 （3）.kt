class Solution {
    fun solution(slice: Int, n: Int): Int = if (n % slice > 0) n / slice + 1 else n / slice
}