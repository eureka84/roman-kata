package com.eureka.katas

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * @author asciarra
 */
class RomanSpec: StringSpec() {
    init {

        "should convert 0 into an empty string" {
            0.asRoman() shouldBe ""
        }

        "should convert 1" {
            1.asRoman() shouldBe "I"
        }

        "should convert 2" {
            2.asRoman() shouldBe "II"
        }

        "should convert 3" {
            3.asRoman() shouldBe "III"
        }

        "should convert 5" {
            5.asRoman() shouldBe "V"
        }

        "should convert 8" {
            8.asRoman() shouldBe "VIII"
        }

        "should convert 10" {
            10.asRoman() shouldBe "X"
        }

        "should convert 4" {
            4.asRoman() shouldBe "IV"
        }

        "should convert 9" {
            9.asRoman() shouldBe "IX"
        }
    }

    private fun Int.asRoman(): String {
        val roman = Roman(this)
        return roman.toString()
    }
}

