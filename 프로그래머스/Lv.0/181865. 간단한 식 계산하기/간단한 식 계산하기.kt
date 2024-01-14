class Solution {
    fun solution(binomial: String): Int {
        var answer: Int = 0
        val list = binomial.split(" ")
        when (list[1]) {
            "+" -> answer = list[0].toInt() + list[2].toInt()
            "-" -> answer = list[0].toInt() - list[2].toInt()
            "*" -> answer = list[0].toInt() * list[2].toInt()
        }
        return answer
    }
}