class Solution {
    fun solution(n: Int): IntArray {
        var answer = mutableListOf<Int>()
        var num = n
        answer.add(num)
        
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2
                answer.add(num)
            }
            else {
                num = num * 3 + 1
                answer.add(num)
            }
        }
        return answer.toIntArray()
    }
}