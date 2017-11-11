package com.eureka.katas

class Roman(decimal: Int) {

    private val symbols = listOf(
            10 to "X",
            5 to "V",
            1 to "I")

    private val value: String by lazy {
        var remaining = decimal
        var roman = ""
        symbols.forEach { (arabic, symbol) ->
            while (remaining >= arabic) {
                roman += symbol
                remaining -= arabic
            }
        }
        return@lazy roman
    }

    override fun toString(): String {
        return value
    }

}