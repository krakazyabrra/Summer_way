package tictactoe

fun main() {

    val line = readln()
    println("---------")

    print("| ")
    for (i in 0..line.length-7) {
        print(line[i]+" ")
    }
    println("|")

    print("| ")
    for (i in 3..line.length-4) {
        print(line[i]+" ")
    }
    println("|")

    print("| ")
    for (i in 6..line.length-1) {
        print(line[i]+" ")
    }
    println("|")

    println("---------")

}