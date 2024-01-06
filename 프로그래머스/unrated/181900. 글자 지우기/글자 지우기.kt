class Solution {
    fun solution(my_string: String, indices: IntArray): String {
        val st = StringBuilder(my_string)
        
        for (i in indices) {
            st.setCharAt(i, ' ')
        }
        return st.toString().replace(" ", "")
    }
}