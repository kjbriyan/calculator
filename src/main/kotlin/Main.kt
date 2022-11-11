fun main() {

    var startCalculator = true

    while (startCalculator) {

        println("\n--- Simple Calculator ---")
        println("1.\tPenjumlahan")
        println("2.\tPengurangan")
        println("3.\tPerkalian")
        println("4.\tPembagian")
        println("5.\tPangkat")

        print("\nMasukkan pilihan\t: ")
        val pilihan = readLine()

        if (isInputCorrect(pilihan)) {
            if (pilihan!!.toInt() < 1 || pilihan.toInt() > 5) {
                startCalculator = false
                println("\nInput salah! program selesai.")
                continue
            }
        } else {
            startCalculator = false
            println("\nInput salah! program selesai.")
            continue
        }

        print("\nMasukkan bilangan 1\t: ")
        val bilangan1 = readLine()

        print("Masukkan bilangan 2\t: ")
        val bilangan2 = readLine()


        if (isInputCorrect(bilangan1) && isInputCorrect(bilangan2)) {

            val calculator =  Calculator(pilihan.toInt(), bilangan1!!.toDouble(), bilangan2!!.toDouble())

            println("\nHasil ${calculator.operasiPilihan}\t: ${calculator.hasilPerhitungan}\n")

            print("Hitung lagi? y = Yes, else = No : ")
            val ulangLagi = readLine()


            if (ulangLagi == null) {
                startCalculator = false
                println("\nInput salah! program selesai.")
            } else {
                if (ulangLagi.toString() == "y" || ulangLagi == "Y") {
                    continue
                } else {
                    startCalculator = false
                    println("\nProgram selesai.")
                }
            }

        } else {
            startCalculator = false
            println("\nInput salah! program selesai.")
        }
    }
}

fun isMatches(value: String): Boolean = value.matches("-?\\d+(\\.\\d+)?".toRegex())

fun isInputCorrect(value: String?): Boolean {
    return if (value == null) {
        false
    } else {
        isMatches(value)
    }
}