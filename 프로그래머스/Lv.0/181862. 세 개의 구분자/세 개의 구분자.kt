class Solution {
    fun solution(myStr: String): Array<String> {
        var answer = mutableListOf<String>()
        
        answer.addAll(myStr.split("[abc]".toRegex()).filter { it != "" })
        return if (answer.size > 0) answer.toTypedArray() else arrayOf("EMPTY")
    }
}