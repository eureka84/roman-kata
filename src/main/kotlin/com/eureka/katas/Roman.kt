package com.eureka.katas

class Roman(decimal: Int) {
    companion object {
        private val symbolsMap = mapOf(
        1000 to "M",
                900 to "CM",
                500 to "D",
                400 to "CD",
                100 to "C",
                90 to "XC",
                50 to "L",
                40 to "XL",
                10 to "X",
                9 to "IX",
                5 to "V",
                4 to "IV",
                1 to "I")
    }

    private val value: String = convert(decimal)

    private fun convert(decimal: Int): String {
        symbolsMap.forEach { (arabic, symbol) ->
            if (decimal>= arabic) {
                return symbol + convert(decimal - arabic)
            }
        }
        return ""
    }


    override fun toString(): String {
        return value
    }

}