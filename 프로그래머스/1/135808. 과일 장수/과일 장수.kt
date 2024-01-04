class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        var array = score.sorted().toTypedArray()
        
        array.sliceArray(array.size % m..array.lastIndex).filterIndexed { index, _ -> index % m == 0 }.map { answer +=  it * m}
        
        return answer
    }
}