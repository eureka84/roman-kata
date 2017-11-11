package com.eureka.katas

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * @author asciarra
 */
class RomanSpec: StringSpec() {
    init {

        "should convert 0 into an empty string" {
            val roman = Roman(0)
            roman.toString() shouldBe ""
        }

        "should convert 1" {
            val roman = Roman(1)
            roman.toString() shouldBe "I"
        }

        "should convert 2" {
            val roman = Roman(2)
            roman.toString() shouldBe "II"
        }

        "should convert 3" {
            val roman = Roman(3)
            roman.toString() shouldBe "III"
        }

        "should convert 5" {
            val roman = Roman(5)
            roman.toString() shouldBe "V"
        }

        "should convert 8" {
            val roman = Roman(8)
            roman.toString() shouldBe "VIII"
        }

        "should convert 10" {
            val roman = Roman(10)
            roman.toString() shouldBe "X"
        }

        "should convert 4" {
            val roman = Roman(4)
            roman.toString() shouldBe "IV"
        }

        "should convert 9" {
            val roman = Roman(9)
            roman.toString() shouldBe "IX"
        }
    }
}

