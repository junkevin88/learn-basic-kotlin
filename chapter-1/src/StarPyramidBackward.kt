
fun main() {
    val row = 8
    var pattern = 15
    val space = " "
    val star = "*"
    for (i in 1..row) {
        for (j in 1..i - 1) {
            print(space)
        }
        for (k in 1..pattern) {
            print(star)
        }
        println()
        pattern -= 2
    }
}