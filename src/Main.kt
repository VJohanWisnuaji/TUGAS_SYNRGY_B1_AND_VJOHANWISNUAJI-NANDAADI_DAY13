import java.util.*
fun main() {

    fun main() {
        println("------------------------")
        println("-------MENU UTAMA-------")
        println("1. Login")
        println("0. Exit")
        print("Pilih menu: ")
        var inputMenu: String = readLine()!!
        println("------------------------")
        print("Please input Username: ")
        print("Please input Password: ")
        val inputUserName: String = readLine()!!
        val inputPassword: String = readLine()!!
        println("------------------------")


    }

    fun pembelianTiket() {

        println(" ")
        println("------------------------------")
        println("     == Selamat Data,  ==")
        println("------------------------------")
        println("1. Pembelian Tiket")
        println("2. Logout")
        println("Note: tulis A,B,C,D atau E untuk memilih menu")
        print("Masukkan pilihan menu: ")
        val inputPilihan: String = readLine()!!

        fun selesai() {
            println("Apakah anda ingin kembali? (Yes/No) ")
            val checkNextStudy: String = readLine()!!
            if (checkNextStudy == "Yes") {
                return pembelianTiket()
            } else {
                println("-----  ---------------------------------  -----")
                println("-----  Terimakasih sudah menggunakan ATM  -----")
                println("-----  ---------------------------------  -----")
            }
        }

        when (inputPilihan) {
            "1" -> {
                println("-------------------------")
                println("--------CEK SALDO--------")
                println("-------------------------")

//                atm.ceksaldo()
                selesai()
            }
            "2" -> selesai()
            else -> {
                println(" Check note untuk cara memilih menu!")
                return pembelianTiket()
            }
        }

    }
}