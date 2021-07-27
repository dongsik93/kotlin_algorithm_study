package inout
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val cnt = sc.nextInt()
    val sumList = mutableListOf<Int>()
    for (i in 1..cnt) {
        val (a, b) = with(sc) {
            nextInt() to nextInt()
        }
        sumList.add(a+b)
    }
    sumList.forEach(System.out::println)
}
