class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        var x: Int = (a.toString() + b.toString()).toInt()
        var y: Int = 2 * a * b
        
        if(x > y) answer = x
        else answer = y
        return answer
    }
}