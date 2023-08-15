class Solution {
    fun solution(my_string: String, is_prefix: String): Int {
        var answer: Int = 0
        if(my_string.length < is_prefix.length) return 0
        for(i in 0..is_prefix.length - 1) {
            if(my_string[i] == is_prefix[i]) {
                continue
            }
            else {
                answer = 100
                break
            }
        }
        if(answer == 100) answer = 0
        else answer = 1
        return answer
    }
}