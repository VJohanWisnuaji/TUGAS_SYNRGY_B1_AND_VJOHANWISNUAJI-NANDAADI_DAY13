import java.util.*
fun main() {

    fun main2() {
        println("------------------------")
        println("-------MENU UTAMA-------")
        println("1. Login")
        println("0. Exit")
        print("Pilih menu: ")
        var inputMenu: String = readLine()!!


        fun selesai() {
            println("Apakah anda ingin kembali? (Yes/No) ")
            val checkNextStudy: String = readLine()!!
            if (checkNextStudy == "Yes") {
                return main2()
            } else {
                println("-----  ---------------------------------  -----")
                println("-----             Terimakasih             -----")
                println("-----  ---------------------------------  -----")
            }
        }

        fun login() {
            println("------------------------")
            print("Please input Username: ")
            print("Please input Password: ")
            val inputUserName: String = readLine()!!
            val inputPassword: String = readLine()!!
            println("------------------------")
        }


        when(inputMenu){
            "1" -> login()
            "0" ->selesai()
            else -> {
                println("Pilihan tidak ada silahkan ulangi kembali")
                main2()
            }
        }

    }

    fun pembelianTiket() {

        println(" ")
        println("------------------------------")
        println("     == Selamat Datang,   ==")
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
                println("-----             Terimakasih             -----")
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
    main()
}