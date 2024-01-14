class Solution {
    fun solution(n: Int): Array<IntArray> {
        var answer = mutableListOf<IntArray>()
        for (i in 1..n) {
            answer.add(IntArray(n) { if (it == i - 1) 1 else 0})
        }
        return answer.toTypedArray()
    }
}