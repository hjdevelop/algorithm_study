class Solution {
    fun solution(strlist: Array<String>): MutableList<Int> {
        var answer = mutableListOf<Int>()
        strlist.forEach { answer.add(it.length)}
        return answer
    }
}