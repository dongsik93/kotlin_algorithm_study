package ordering

import java.util.*

fun main() = with(Scanner(System.`in`)){
    val n = nextInt()
    val list = arrayListOf<Pair<Int,String>>()

    for (i in 0 until n) {
        list.add(Pair(nextInt(),nextLine()))
    }

    list.sortedWith(compareBy {it.first}).forEach {
        println("${it.first}${it.second}")
    }
}