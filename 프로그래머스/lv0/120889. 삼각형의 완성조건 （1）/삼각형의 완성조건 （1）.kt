class Solution {
    fun solution(sides: IntArray): Int {
        var answer: Int = 0
        if(sides[0] > sides[1] && sides[0] > sides[2]) {
            if(sides[0] < sides[1] + sides[2]) {
                answer = 1
            }
            else {
                answer = 2
            }
        }
        else if(sides[1] > sides[0] && sides[1] > sides[2]) {
            if(sides[1] < sides[0] + sides[2]) {
                answer = 1
            }
            else {
                answer = 2
            }
        }
        else {
            if(sides[2] < sides[1] + sides[0]) {
                answer = 1
            }
            else {
                answer = 2
            }
        }
        return answer
    }
}