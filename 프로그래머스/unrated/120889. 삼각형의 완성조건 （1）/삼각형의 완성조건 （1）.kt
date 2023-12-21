class Solution {
    fun solution(sides: IntArray): Int = if (sides.sorted()[2] < sides.sorted()[0] + sides.sorted()[1]) 1
    else 2
}