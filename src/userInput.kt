fun main(args: Array<String>) {
    /*when = switch*/

    print("Silakan isi usia: ")
    var usia = readLine()!!.toInt() //what is !! or ? before '.' -- to throw exception

    when(usia){
        10 -> println("Usia 10")
        15 -> println("Usia 15")
        20 -> println("Usia 20")

        else -> {
            println("None")
        }

    }
}