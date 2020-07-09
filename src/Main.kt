import java.util.*

fun main() {
    main2()
}

fun main2() {
    println("------------------------")
    println("-------MENU UTAMA-------")
    println("1. Login")
    println("0. Exit")
    print("Pilih menu: ")
    val inputMenu: String = readLine()!!


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
        } else {
            User.user = inputUserName
            pembelianTiket()
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


fun pembelianTiket() {
    println(" ")
    println("---------------------------------")
    println("==  Selamat Datang, ${User.user}   ==")
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
            return pembelianTiket()
        } else {
            println("-----  ---------------------------------  -----")
            println("-----             Terimakasih             -----")
            println("-----  ---------------------------------  -----")
        }
    }

    when (inputPilihan) {
        "1" -> {
            maskapai()
            selesai()
        }
        "2" -> selesai()
        else -> {
            println(" Check note untuk cara memilih menu!")
            return pembelianTiket()
        }
    }
}

fun maskapai() {
    println("------------------------------")
    println("--------Pilih Maskapai--------")
    println("------------------------------")
    println("")
    println("1. Binar Air ECONOMY   CGK-YIA PP - Rp. 355.000")
    println("2. Binar Air EXECUTIVE CGK-YIA PP - Rp. 775.000")
    println("Masukkan pilihan maskapai anda: ")
    val inputMaskapai: String = readLine()!!

    when (inputMaskapai) {
        "1" -> {

        }
        "2" -> {

        }
        else -> {
            println(" Pilihan tidak ada silahkan cek kembali")
            return maskapai()
        }
    }
}