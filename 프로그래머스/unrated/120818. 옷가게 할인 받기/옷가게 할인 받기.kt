class Solution {
    fun solution(price: Int): Int {
        return if(0 <= price && price < 100000) price
        else if (100000 <= price && price < 300000) price * 95 / 100
        else if (300000 <= price && price < 500000) price * 9 / 10
        else price * 8 / 10
    }
}