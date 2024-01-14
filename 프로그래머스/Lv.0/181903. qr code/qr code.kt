class Solution {
    fun solution(q: Int, r: Int, code: String): String = code.filterIndexed { index, c -> index % q == r }
}