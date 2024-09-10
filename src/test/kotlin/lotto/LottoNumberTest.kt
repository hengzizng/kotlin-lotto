package lotto

import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeSameInstanceAs
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows

class LottoNumberTest {
    @Test
    fun test1() {
        assertThrows<IllegalArgumentException> { LottoNumber.from(0) }
        assertThrows<IllegalArgumentException> { LottoNumber.from(46) }
    }

    @Test
    fun test2() {
        assertDoesNotThrow { LottoNumber.from(0) }
        assertDoesNotThrow { LottoNumber.from(46) }
    }

    @Test
    fun `동등성`() {
        val number1 = LottoNumber.from(1)
        val number2 = LottoNumber.from(1)
        number1 shouldBe number2
    }

    @Test
    fun `동일성`() {
        val number1 = LottoNumber.from(1)
        val number2 = LottoNumber.from(1)
        number1 shouldBeSameInstanceAs number2
    }
}
