class Solution {
    fun solution(myString: String): Array<String> = myString.split("x").sorted().filter { it.isNotEmpty() }.toTypedArray()
}