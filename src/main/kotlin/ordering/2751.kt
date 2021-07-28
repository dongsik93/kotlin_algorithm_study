package ordering

import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val numArray = BooleanArray(2000001)

    for (i in 0 until n) {
        numArray[readLine().toInt() + 1000000] = true
    }

    val sb = StringBuilder()
    for (i in numArray.indices) {
        if (numArray[i]) sb.append(i - 1000000).append("\n")
    }
    println(sb)
}