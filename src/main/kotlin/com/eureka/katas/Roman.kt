package com.eureka.katas

class Roman(decimal: Int) {

    private val symbols = listOf(Pair(1, "I"))

    private val value: String by lazy {
        var remaining = decimal
        var roman = ""
        symbols.forEach { (asInt, asString) ->
            while (remaining >= asInt) {
                roman += asString
                remaining -= asInt
            }
        }
        return@lazy roman
    }

    override fun toString(): String {
        return value
    }

}