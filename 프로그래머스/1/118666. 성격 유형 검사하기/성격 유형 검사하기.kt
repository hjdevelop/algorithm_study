class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        var answer: String = ""
        val map: LinkedHashMap<Char, Int> = linkedMapOf('R' to 0, 'T' to 0, 'C' to 0, 'F' to 0, 'J' to 0, 'M' to 0, 'A' to 0, 'N' to 0)
        
        for (i in 0 until survey.size) {
             when (choices[i]) {
                  1 -> map.compute(survey[i][0]) { _, value -> value?.plus(3) }
                  2 -> map.compute(survey[i][0]) { _, value -> value?.plus(2) }
                  3 -> map.compute(survey[i][0]) { _, value -> value?.plus(1) }
                  4 -> {}
                  5 -> map.compute(survey[i][1]) { _, value -> value?.plus(1) }
                  6 -> map.compute(survey[i][1]) { _, value -> value?.plus(2) }
                  7 -> map.compute(survey[i][1]) { _, value -> value?.plus(3) }
             }
        }
        val keys = map.keys.toList()
        val values = map.values.toList()
        
        for (i in 0 until map.size step 2) {
            if (values[i] > values[i + 1]) answer += keys[i]
            else if (values[i] < values[i + 1]) answer += keys[i + 1]
            else {
                 if (keys[i] < keys[i + 1]) answer += keys[i]
                 else answer += keys[i + 1]
            }
        }
        return answer
    }
}