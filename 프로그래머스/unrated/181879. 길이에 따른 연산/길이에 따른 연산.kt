class Solution {
    fun solution(num_list: IntArray): Int {
        var answer : Int = 0
        if (num_list.size >= 11) {
            answer = num_list.reduce() {acc, number ->
                acc + number
            }
        }
        else {
            answer = num_list.reduce() {acc, number ->
                acc * number
            } 
        }
        return answer
    }
}