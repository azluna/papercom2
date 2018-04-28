fun main(args: Array<String>) {
    add()
    penambahan(angka1 = 5, angka2 = 2)
    println("Hasil perkalian adalah ${perkalian(angkaA = 3, angkaB = 4)}")
}
//function tanpa parameter dan tanpa return
fun add(){
    println("Function atau Method")
}

//function dengan parameter tanpa return
fun penambahan(angka1: Int, angka2: Int){
    println("$angka1 + $angka2 = ${angka1+angka2}")
}

//function dengan parameter dan return
fun perkalian(angkaA: Int, angkaB: Int): Int{
   //penulisan rumus
    var hasil = angkaA * angkaB
    return hasil

}