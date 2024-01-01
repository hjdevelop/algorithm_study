class Solution {
    fun solution(my_string: String): Array<String> {
        var answer = mutableListOf<String>()
        
        for (i in 0 until my_string.length) {
            answer.add(my_string.substring(i until my_string.length))
        }
        return answer.sorted().toTypedArray()
    }
}