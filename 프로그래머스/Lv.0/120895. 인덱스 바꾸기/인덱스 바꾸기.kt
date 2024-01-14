class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        val st = StringBuilder(my_string)
        val temp = st[num1]
        st[num1] = st[num2]
        st[num2] = temp
        
        return st.toString()
    }
}