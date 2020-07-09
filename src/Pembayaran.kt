import java.text.NumberFormat
import java.util.*

class Pembayaran() {
    val localeID = Locale("in", "ID")
    val numberFormat = NumberFormat.getCurrencyInstance(localeID)

    fun bayar()
        println("Pembayaran ${Maskapai.maskapai}")
        print("Masukkan nominal uang anda: ")
        val jumlah: String = readLine()!!
        val sisa: Int = jumlah % Maskapai.harga
        if (jumlah < sisa) {
            println("Uang yang anda bayarkan adalah sebesar ${numberFormat.format(jumlah).toString()}")
            println("Uang Anda kurang silahkan ulang proses")
            pembelianTiket()
        }
        else if (sisa > 1) {
            println("============================================================================")
            println("Uang yang anda bayarkan adalah sebesar ${numberFormat.format(jumlah).toString()}")
            println("Uang Anda akan dikembalikan sebesar ${numberFormat.format(sisa).toString()}")
            println("============================================================================"))
        } else {
            println("Uang yang anda bayarkan adalah sebesar ${numberFormat.format(jumlah).toString()}")
            println("============================================================================")
        }
    }
}