class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        for(i in 0..my_string.length - 1) {
            answer = my_string[i].plus(answer)
        }
        println(answer)
        return answer
    }
}