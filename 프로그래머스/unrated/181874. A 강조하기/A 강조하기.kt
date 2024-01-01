class Solution {
    fun solution(myString: String): String {
        var answer: String = ""
        for(i in myString.toCharArray()) {
            if (i == 'a') answer += i.uppercase()
            else if (i != 'A' && i.isUpperCase()) answer += i.lowercase()
            else answer += i
        }
        return answer
    }
}