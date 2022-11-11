class Calculator(private val operasi: Int, private val value1: Double, private val value2: Double) {


    val operasiPilihan: String
        get() {
            return when (operasi) {
                1 -> "Penjumlahan"
                2 -> "Pengurangan"
                3 -> "Perkalian"
                4 -> "Pembagian"
                else -> "Pangkat"
            }
        }

    fun formatDouble(value: Double) = String.format("%.2f", value).toDouble()
    val hasilPerhitungan: Double
        get() {
            return when (operasi) {
                1 -> formatDouble(value1 + value2)
                2 -> formatDouble(value1 - value2)
                3 -> formatDouble(value1 * value2)
                4 -> formatDouble(value1 / value2)
                else ->Pangkat(value1,value2.toInt())
            }
        }

    fun Pangkat(NUMBER: Double, END: Int): Double {
        var SUM: Double = NUMBER * NUMBER
        println(NUMBER.toString() + " ^ 2 = $SUM")
        if (END > 2) {
            var NO = 3
            for (NO in NO..END step 1) {
                print("Pangkat : $NO : ")
                var SUMS: Double = NUMBER
                SUM = SUM * SUMS
                println(NUMBER.toString() + " ^ $NO = $SUM")
            }
        } else {
            println("SELESAI")
        }
        return SUM
    }
}