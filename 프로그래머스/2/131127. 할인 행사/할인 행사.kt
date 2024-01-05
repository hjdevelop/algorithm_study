class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer: Int = 0
        
        for (i in 0 until discount.size - 9) {
            val countArray = BooleanArray(want.size)
            for (j in 0 until want.size) {
                if (discount.sliceArray(i..i + 9).count { it == want[j] } == number[j]) {
                    countArray[j] = true
                }
            }
            if (countArray.all { it }) answer++
        }
        return answer
    }
}