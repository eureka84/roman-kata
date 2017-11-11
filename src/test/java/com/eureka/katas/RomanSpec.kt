package com.eureka.katas

import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.StringSpec

/**
 * @author asciarra
 */
class RomanSpec: StringSpec() {
    init {

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
    }
}

