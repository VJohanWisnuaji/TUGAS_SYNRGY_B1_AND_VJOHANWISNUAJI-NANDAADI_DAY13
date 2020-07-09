import java.text.NumberFormat
import java.util.*

class Pembayaran() {
    val localeID = Locale("in", "ID")
    val numberFormat = NumberFormat.getCurrencyInstance(localeID)

    fun bayar() {
        println("Pembayaran ${Maskapai.maskapai}")
        print("Masukkan nominal uang anda: ")
        val jumlah: Int = readLine()!!.toInt()
        val sisa: Int = jumlah % Maskapai.harga
        if (jumlah < Maskapai.harga) {
            println("Uang yang anda bayarkan adalah sebesar ${numberFormat.format(jumlah).toString()}")
            println("Harga tiket adalah ${numberFormat.format(Maskapai.harga).toString()}")
            println("============================================================================")
            println("Transaksi Gagal")
            println("============================================================================")
            println("Uang Anda kurang silahkan ulang proses")
            println("(tekan enter key untuk lanjutkan)")
            val dummy: String = readLine()!!
            pembelianTiket()
        }
        else if (jumlah > Maskapai.harga) {
            println("============================================================================")
            println("Uang yang anda bayarkan adalah sebesar ${numberFormat.format(jumlah).toString()}")
            println("Harga tiket adalah ${numberFormat.format(Maskapai.harga).toString()}")
            println("============================================================================")
            println("Uang Anda akan dikembalikan sebesar ${numberFormat.format(sisa).toString()}")
            println("============================================================================")
            println("Transaksi Berhasil")
            println("============================================================================")

        } else {
            println("Uang yang anda bayarkan adalah sebesar ${numberFormat.format(jumlah).toString()}")
            println("Harga tiket adalah ${numberFormat.format(Maskapai.harga).toString()}")
            println("============================================================================")
            println("Transaksi Berhasil")
            println("============================================================================")

        }
    }
}