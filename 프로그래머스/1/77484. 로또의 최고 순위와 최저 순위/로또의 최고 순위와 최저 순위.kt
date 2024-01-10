class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        
        val correctMin = lottos.count { it in win_nums }
        val correctMax = correctMin + lottos.count { it == 0 }
        
        if (correctMax > 1) answer.add(7 - correctMax) else answer.add(6)
        if (correctMin > 1) answer.add(7 - correctMin) else answer.add(6)
        
        return answer.toIntArray()
    }
}