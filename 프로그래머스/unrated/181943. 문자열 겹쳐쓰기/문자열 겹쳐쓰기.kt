class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer: String = ""
        val charArray = my_string.toCharArray()
        
        for(i in s..s + overwrite_string.length - 1) {
            charArray[i] = overwrite_string[i - s]
        }
        answer = String(charArray)
        return answer
        
    }
}