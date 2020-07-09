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
            println("------------------------------")
            println("--------Pilih Maskapai--------")
            println("------------------------------")
            println("Pembelian Tiket")
            println("1. Binar Air Economy    CGK-YIA PP - Rp. 355.000,00")
            println("2. Binar Air Executive  CGK-YIA PP - Rp. 775.000,00")
            println("3. Kembali ke menu sebelumnya")
            print("Masukkan pilihan menu: ")
            val maskapai: String = readLine()!!
            when (maskapai) {
                "1" -> {
                    Maskapai.maskapai = "Binar Air Economy"
                    Maskapai.harga = 355000
                    Pembayaran().bayar()
                }
                "2" -> {
                    Maskapai.maskapai = "Binar Air Executive"
                    Maskapai.harga = 775000
                    Pembayaran().bayar()
                }
                "3" -> {

                }
                else -> {
                    println(" Pilihan tidak ada silahkan cek kembali")
                    return pembelianTiket()
                }
            }
        }

        "2" -> selesai()
        else -> {
                println(" Pilihan tidak ada silahkan cek kembali")
                return pembelianTiket()
            }
        }
    }

