class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var mul = 1
        var pow = 0
        
        for (i in num_list) {
            mul *= i
            pow += i
        }
        
        if (mul < pow * pow) answer = 1
        else if (mul > pow * pow) answer = 0
        return answer
    }
}