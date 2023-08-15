class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var numMul: Int = 1
        var numSum: Int = 0
        
        for(i in num_list) {
            numMul *= i
            numSum += i
        }
        numSum *= numSum
        if(numMul > numSum) answer = 0
        else answer = 1
        return answer
    }
}