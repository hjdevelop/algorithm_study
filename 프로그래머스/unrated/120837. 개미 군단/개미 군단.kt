class Solution {
    fun solution(hp: Int): Int {
        var answer: Int = 0
        var preHp = hp
        answer += preHp / 5
        preHp = preHp % 5
        answer += preHp / 3
        preHp = preHp % 3
        answer += preHp 
        
        return answer
    }
}