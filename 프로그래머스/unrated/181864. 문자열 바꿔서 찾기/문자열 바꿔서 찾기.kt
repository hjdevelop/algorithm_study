class Solution {
    fun solution(myString: String, pat: String): Int {
        var replace: String = ""
        for (i in myString) {
            if (i == 'A') replace += 'B'
            else replace += 'A'
        }
        return if (replace.contains(pat)) 1 else 0
    }
}