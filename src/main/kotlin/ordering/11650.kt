fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n = br.readLine().toInt()
    val numList = ArrayList<Pair<Long, Long>>(n)

    repeat(n) {
        val (x, y) = br.readLine().split(" ").map { it.toLong() }
        numList.add(Pair(x, y))
    }

    numList.sortBy { it.first * 1000000 + it.second }
    for (num in numList) {
        bw.write("${num.first} ${num.second}\n")
    }

    bw.flush()
    bw.close()
}