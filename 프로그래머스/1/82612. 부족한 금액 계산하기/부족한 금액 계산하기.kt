class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var totalPrice: Long = (1..count).sumOf { (it * price).toLong() }
        
        return if (money - totalPrice >= 0) 0.toLong() else totalPrice - money
    }
}