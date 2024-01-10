class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr
        
        queries.map { (it[0]..it[1]).filter { num -> num % it[2] == 0 }.map { arr[it]++ } }
        
        return answer
    }
}