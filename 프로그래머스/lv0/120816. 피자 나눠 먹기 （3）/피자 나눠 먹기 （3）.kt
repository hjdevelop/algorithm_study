class Solution {
    fun solution(slice: Int, n: Int): Int {
        var answer: Int = 0
        if (n % slice == 0) {
            if(n > slice) {
                answer = n / slice
            }
            else {
                answer = 1
            }
        }
        else {
            if (n > slice) {
                answer = n / slice + 1
            }
            else {
                answer = 1
            }
        }
        return answer
    }
}