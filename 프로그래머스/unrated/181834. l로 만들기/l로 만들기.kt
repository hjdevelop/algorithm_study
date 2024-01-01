class Solution {
    fun solution(myString: String): String {
        val stringBuilder = StringBuilder(myString)
        for (i in 0 until myString.length) {
           if (myString[i] < 'l') {
               stringBuilder.setCharAt(i, 'l')
           }
        }
        return stringBuilder.toString()
    }
}