import java.lang.Math.pow
import java.util.*

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var num = n
        val st = Stack<Int>()
        
        while (num > 0) {
            st.push(num % 3)
            num /= 3
        }
        
        for (i in 0 until st.size) {
            answer += st.pop() * pow(3.0, i.toDouble()).toInt()
        }
        return answer
    }
}