class Solution {
    fun solution(order: Array<String>): Int {
        var answer: Int = 0
        for (i in order) {
            when (i) {
                "iceamericano", "americanoice", "hotamericano", "americanohot", "americano", "anything" -> answer += 4500
                else -> answer += 5000
            }
        }
        return answer
    }
}