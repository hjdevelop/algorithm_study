class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0 
        val odd = num_list.filterIndexed { index, _ -> index % 2 == 0}.sum()
        val even = num_list.filterIndexed { index, _ -> index % 2 != 0}.sum()
        
        if (odd >= even) answer = odd
        else answer = even
        
        return answer
    }
}