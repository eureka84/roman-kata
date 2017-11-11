package com.eureka.katas

import io.kotlintest.matchers.shouldEqual
import junitparams.JUnitParamsRunner
import junitparams.Parameters
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author asciarra
 */
@RunWith(JUnitParamsRunner::class)
class RomanParametrizedTest {

    @Test
    @Parameters("1, I", "2, II", "3, III", "4, IV", "5, V",
            "8, VIII", "9, IX", "10, X", "14, XIV", "15, XV",
            "1944, MCMXLIV", "1943, MCMXLIII")
    fun convert(decimal: Int, roman: String) {
        Roman(decimal).toString() shouldEqual roman
    }
}