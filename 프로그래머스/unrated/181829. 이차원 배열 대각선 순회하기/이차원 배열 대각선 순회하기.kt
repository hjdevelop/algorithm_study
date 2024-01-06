class Solution {
    fun solution(board: Array<IntArray>, k: Int): Int {
        var answer: Int = 0
        
        for (i in 0 until board.size) {
            for (j in 0 until board[i].size) {
                if (i + j <= k) {
                    answer += board[i][j]
                }
            }
        }
        return answer
    }
}