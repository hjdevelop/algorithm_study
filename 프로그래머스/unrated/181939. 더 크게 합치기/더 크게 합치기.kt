class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        var aString: String = a.toString() + b.toString()
        var bString: String = b.toString() + a.toString()
        if(aString.toInt() > bString.toInt()) {
            answer = aString.toInt()
        }
        else if(aString.toInt() < bString.toInt()) {
            answer = bString.toInt()
        }
        else {
            answer = aString.toInt()
        }
        return answer
    }
}