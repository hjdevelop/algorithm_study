class Solution {
    fun solution(names: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        for ((index, name) in names.withIndex()) {
            if (index % 5 == 0) {
                answer = answer.plus(name)
            }
        }
        return answer
    }
}