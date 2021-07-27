package inout

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    while(sc.hasNextInt()) {
        val (a, b) = with(sc) {
            nextInt() to nextInt()
        }
        println(a + b)
    }
}