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
            val inputUserName: String = readLine()!!
            print("Please input Password: ")
            val inputPassword: String = readLine()!!
            println("------------------------")

            if (!User().user.containsKey(inputUserName) || inputPassword != User().user.get(inputUserName)) {
                println("Username atau password salah")
                login()
            }else{
                pembelianTiket(inputUserName)
            }
        }

        when (inputMenu) {
            "1" -> login()
            "0" -> selesai()
            else -> {
                println("Pilihan tidak ada silahkan ulangi kembali")
                main2()
            }
        }
    }
    main2()
}


fun pembelianTiket(index: String) {
    println(" ")
    println("---------------------------------")
    println("==  Selamat Datang, ${index}   ==")
    println("---------------------------------")
    println("1. Pembelian Tiket")
    println("2. Logout")
    println("Note: tulis 1 atau 2 untuk memilih menu")
    print("Masukkan pilihan menu: ")

    val inputPilihan: String = readLine()!!

    fun selesai() {
        println("Apakah anda ingin kembali? (Yes/No) ")
        val checkNextStudy: String = readLine()!!
        if (checkNextStudy == "Yes") {
            return pembelianTiket(index)
        } else {
            println("-----  ---------------------------------  -----")
            println("-----             Terimakasih             -----")
            println("-----  ---------------------------------  -----")
        }
    }

    when (inputPilihan) {
        "1" -> {
            println("------------------------------")
            println("--------Pilih Maskapai--------")
            println("------------------------------")

            selesai()
        }
        "2" -> selesai()
        else -> {
            println(" Check note untuk cara memilih menu!")
            return pembelianTiket(index)
        }
    }

}
