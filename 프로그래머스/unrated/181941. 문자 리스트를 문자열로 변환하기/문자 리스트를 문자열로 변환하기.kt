class Solution {
    fun solution(arr: Array<String>): String {
        var answer: String = ""
        for(i in arr) {
            answer = answer.plus(i)
        }
        return answer
    }
}