package inout

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val total = reader.readLine().toInt()
    for (i in 1..total) {
        val str = reader.readLine().split(",")
        println(str[0].toInt() + str[1].toInt())
    }
}