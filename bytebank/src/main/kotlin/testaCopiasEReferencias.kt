class testaCopiasEReferencias {

    fun main() {

        class conta{
            var titular = ""
            var numero = 0
            var saldo = 0.0

            fun deposita(valor: Double){
                this.saldo += valor
            }

            fun casa(valor: Double){
                if(this.saldo >= valor){
                    saldo -= valor
                }
            }
        }

    }
//fun testaCopiasEReferencias(){
//    println("bem vindo ao Bytebank")
//    val contaLucio = Conta()
//    contaLucio.titular = "Lucio"
//    contaLucio.numero = 1000
//    contaLucio.saldo = 100000.00
//    println(contaLucio.titular)
//
//    val contaLet = Conta()
//    contaLet.saldo = 100.0
//    println(contaLucio.saldo)
//    println(contaLet.saldo)
//    println("${contaLet.saldo}")
//}
//
//class Conta{
//    var titular = ""
//    var numero = 0
//    var saldo = 0.0
//}
//
//fun teslaLacos() {
//
//    for (i in 1..7) {
//
//        if (i == 6) {
//            break
//        }
//        val titular: String = "Alex $i"
//        val numeroConta: Int = 1000 + i
//        var saldo = i + 10.0
////    saldo += 4
//
//        println("titular $titular ")
//        println("número da conta $numeroConta")
//        println("saldo da conta $saldo")
//
//        if (saldo > 0.0) {
//            println("conta é positiva")
//        } else if (saldo == 0.0) {
//            println("conta é neutra")
//        } else {
//            println("conta é negativa")
//
////        testaCondicoes(saldo)
//        }
//
//        fun testaCondicoes(saldo: Double) {
//            if (saldo > 0.0) {
//                println("conta é positiva")
//            } else if (saldo == 0.0) {
//                println("conta é neutra")
//            } else {
//                print("conta é negativa")
//            }
//        }
//    }
//}
}