class Solution {
    fun solution(n: Int, control: String): Int {
        var answer: Int = n
        for(i in 0..control.length - 1) {
            if(control[i] == 'w') {
                answer += 1
            }
            else if(control[i] == 's') {
                answer -= 1
            }
            else if(control[i] == 'd') {
                answer += 10
            }
            else {
                answer -= 10
            }
        }
        return answer
    }
}