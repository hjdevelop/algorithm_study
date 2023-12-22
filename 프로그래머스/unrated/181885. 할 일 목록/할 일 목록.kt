class Solution {
    fun solution(todo_list: Array<String>, finished: BooleanArray) : List<String> = todo_list.filterIndexed { index, i -> finished[index] == false}
}