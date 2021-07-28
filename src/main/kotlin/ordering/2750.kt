package ordering

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val list = IntArray(n)

    repeat(n) {
        list[it] = readLine().toInt()
    }

    list.sorted().forEach(::println)
}