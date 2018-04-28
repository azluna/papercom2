class Mobil(merk: String, warna: String, tahun: Int){

    var merk:String? = null
    var warna: String?= null
    var tahun: Int?= null

    init {
        this.merk = merk
        this.warna = warna
        this.tahun = tahun

    }

    //get merek
    fun getMerk():String?{
        return this.merk
    }

    //setter set merek
    fun setMerk(merk: String){
        this.merk = merk
    }
}

fun main(args: Array<String>) {
    //contructor

    var Honda = Mobil(merk = "HRV", warna = "Silver", tahun = 2018)

    println("Merek mobilku adalah ${Honda.merk}")
    println("Warnanya adalah ${Honda.warna}")
    println("Tahunnya ${Honda.tahun}")

    println("Merek mobilku adalah ${Honda.getMerk()}")
    
}
