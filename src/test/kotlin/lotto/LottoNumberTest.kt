package lotto

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class LottoNumberTest {
    @Test
    fun test1() {
        assertThrows<IllegalArgumentException> { LottoNumber(0) }
        assertThrows<IllegalArgumentException> { LottoNumber(46) }
    }

    @Test
    fun test2() {
        assertDoesNotThrow { LottoNumber(0) }
        assertDoesNotThrow { LottoNumber(46) }
    }

    @Test
    fun `동등성`() {

    }
}