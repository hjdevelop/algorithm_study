class Solution {
    fun solution(myString: String, pat: String): String {
        var answer: String = ""
        
        for (i in 0 until myString.length) {
            if (myString.substring(0..i).endsWith(pat)) {
                answer = myString.substring(0..i)
            }
        }
        return answer
    }
}