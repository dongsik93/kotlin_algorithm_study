package inout

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    while(true) {
        val (a, b) = with(sc) {
            nextInt() to nextInt()
        }
        if (a == 0 && b == 0) {
            break
        } else {
            println(a+b)
        }
    }
}