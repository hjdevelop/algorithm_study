class Solution {
    fun solution(my_string: String, m: Int, c: Int): String = my_string.filterIndexed { index, _ -> index % m == c - 1 }
}