class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr
        
        for (i in queries) {
            for (j in i[0]..i[i.lastIndex]) {
                answer[j]++
            }
        }
        return answer
    }
}