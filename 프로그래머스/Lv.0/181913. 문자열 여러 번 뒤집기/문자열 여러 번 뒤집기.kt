class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        return queries.fold(my_string) { acc, query ->
            acc.replaceRange(query[0]..query[1], acc.substring(query[0]..query[1]).reversed())
        }
    }
}