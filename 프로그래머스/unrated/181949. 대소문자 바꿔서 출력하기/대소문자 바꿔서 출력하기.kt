fun main(args: Array<String>) {
    val s1 = readLine()!!
    var answer = ""
    
    for (i in s1) {
        if (i.isLowerCase()) {
            answer += i.uppercaseChar()
        }
        else {
            answer += i.lowercaseChar()
        }
    }
    print(answer)
}