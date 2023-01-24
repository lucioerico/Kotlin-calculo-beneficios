class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun casa(valor: Double) {
        if (this.saldo >= valor) {
            saldo -= valor
        }
    }
}

