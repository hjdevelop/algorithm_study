class Solution {
    fun solution(price: Int): Int {
        var answer: Int = 0
        if(price >= 100000 && price < 300000) {
            answer = price * 95 / 100
        }
        else if(price >= 300000 && price < 500000) {
            answer = price * 90 / 100
        }
        else if(price < 100000) {
            answer = price
        }
        else {
            answer = price * 80 / 100
        }
        return answer
    }
}