class Solution {
    fun solution(str_list: Array<String>, ex: String): String {
        var answer: String = ""
        for (i in str_list) {
            if (i.contains(ex))
            else answer += i
        }
        return answer
    }
}