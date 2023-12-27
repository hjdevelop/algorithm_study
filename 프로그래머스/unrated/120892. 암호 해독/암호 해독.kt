class Solution {
    fun solution(cipher: String, code: Int): String = cipher.filterIndexed { index, c -> index % code == code - 1 }
}