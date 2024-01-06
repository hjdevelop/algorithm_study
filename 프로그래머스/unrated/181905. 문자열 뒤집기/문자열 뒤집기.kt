class Solution {
    fun solution(my_string: String, s: Int, e: Int): String {
        val stringBuilder = StringBuilder(my_string)
        
        stringBuilder.replace(s, e + 1, my_string.substring(s..e).reversed())
        
        return stringBuilder.toString()
    }
}