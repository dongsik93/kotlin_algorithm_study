package inout

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    reader.readLine().toInt()
    var time = 0
    var sum = 0
    reader.readLine().split(" ")
        .map { it.toInt() }
        .sorted()
        .forEach {
            time += it
            sum += time
        }
    println(sum)
}