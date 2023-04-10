
fun main() {
    val size = 15
    val midpoint = (size-1) / 2
    for (i in 0 until size) {
        for (j in 0 until size) {
            if (i == j || i + j == size - 1) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }

}
