class Solution {
    fun solution(order: Int): Int = order.toString().filter { it.digitToInt() % 3 == 0 && it != '0' }.count()
}