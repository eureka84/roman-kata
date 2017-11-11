package com.eureka.katas

class Roman(decimal: Int) {

    private val symbolsMap = mapOf(
            10 to "X",
            5 to "V",
            1 to "I")

    private val value: String by lazy {
        when (decimal) {
            9 -> {
                var roman = "I" + symbolsMap.get(decimal+1)

                return@lazy roman
            }
            4 -> {
                var roman = "I" + symbolsMap.get(decimal+1)

                return@lazy roman
            }
            else -> {
                var remaining = decimal
                var roman = ""
                symbolsMap.forEach { (arabic, symbol) ->
                    while (remaining >= arabic) {
                        roman += symbol
                        remaining -= arabic
                    }
                }
                return@lazy roman
            }
        }
    }

    override fun toString(): String {
        return value
    }

}