class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String = my_strings.mapIndexed { index, s -> s.slice(parts[index][0]..parts[index][1]) }.joinToString("")
}