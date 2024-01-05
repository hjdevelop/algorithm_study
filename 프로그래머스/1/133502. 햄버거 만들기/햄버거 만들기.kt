import java.util.*

class Solution {
    fun solution(ingredient: IntArray): Int {
        var answer: Int = 0
        val st = Stack<Int>()
        
        for (i in ingredient) {
            st.push(i)
            
            if (st.size >= 4) {
                val num1 = st.pop()
                val num2 = st.pop()
                val num3 = st.pop()
                val num4 = st.pop()
                
                if (num4 == 1 && num3 == 2 && num2 == 3 && num1 == 1) answer++
                else {
                st.push(num4)
                st.push(num3)
                st.push(num2)
                st.push(num1)
                }
            }
        }
        return answer
    }
}