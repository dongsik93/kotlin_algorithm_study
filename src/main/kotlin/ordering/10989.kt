package ordering

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = System.`out`.bufferedWriter()
    val n: Int = this.readLine().toInt()

    val array = IntArray(10001)
    for (i in 0 until n) {
        array[this.readLine().toInt()]++
    }
    this.close()

    for (i in array.indices) {
        bw.write("$i\n".repeat(array[i]))
    }
    bw.close()
}