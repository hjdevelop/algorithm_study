class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        for (i in my_string) {
            if (i.isLowerCase()) answer += i.uppercase()
            else if (i.isUpperCase()) answer += i.lowercase()
        }
        return answer
    }
}