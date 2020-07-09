import java.text.NumberFormat
import java.util.*

class Pembayaran() {
    val localeID = Locale("in", "ID")
    val numberFormat = NumberFormat.getCurrencyInstance(localeID)

    fun bayar(jumlah: Int)
        val sisa: Int = jumlah % 355000
        if (sisa > 1) {
            println("Uang Anda akan dikembalikan sebesar ${numberFormat.format(sisa).toString()}")
            println("============================================================================")
            this.sisasaldo = sisasaldo + jumlah - sisa
            println("Uang yang anda tabungkan adalah sebesar ${numberFormat.format(jumlah - sisa).toString()}")
            println("Saldo anda menjadi ${numberFormat.format(sisasaldo).toString()}")
            println("============================================================================")
        } else {
            this.sisasaldo = sisasaldo + jumlah
            println("Uang yang anda setor adalah sebesar ${numberFormat.format(jumlah).toString()}")
            println("Saldo anda menjadi ${numberFormat.format(sisasaldo).toString()}")
            println("============================================================================")
        }
    }
}