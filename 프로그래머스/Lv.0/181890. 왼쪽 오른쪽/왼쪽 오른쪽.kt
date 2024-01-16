class Solution {
    fun solution(str_list: Array<String>): Array<String> {
        var answer = mutableListOf<String>()
        
        for (i in 0 until str_list.size) {
            if (str_list[i] == "l") {
                answer.addAll(str_list.sliceArray(0..i - 1))
                break
            }
            else if (str_list[i] == "r") {
                answer.addAll(str_list.sliceArray(i + 1..str_list.lastIndex))
                break
            }
        }
        return answer.toTypedArray()
    }
}