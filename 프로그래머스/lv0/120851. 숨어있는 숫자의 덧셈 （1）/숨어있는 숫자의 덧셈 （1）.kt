class Solution {
    fun solution(my_string: String): Int {
        var answer: Int = 0
        for(i in 0..my_string.length - 1) {
            if(my_string[i].toInt() >= 48 && my_string[i].toInt() <= 57) {
                answer += my_string[i].digitToInt()
            }
        }
        println(answer)
        return answer
    }
}