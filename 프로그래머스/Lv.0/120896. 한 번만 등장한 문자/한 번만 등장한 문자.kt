class Solution {
    fun solution(s: String): String = s.groupBy { it }.filter { it.value.count() == 1 }.map { it.key }.toList().sorted().joinToString("")
}