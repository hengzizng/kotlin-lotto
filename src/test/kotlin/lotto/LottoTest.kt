package lotto

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class LottoTest {
    @Test
    fun `6개가 아닌 경우`() {
        assertThrows<IllegalArgumentException> { Lotto(1, 2, 3, 4, 5) }
        assertThrows<IllegalArgumentException> { Lotto(1, 2, 3, 4, 5, 6, 7) }
    }

    @Test
    fun `로또 번호가 중복되는 경우`() {
        assertThrows<IllegalArgumentException> { Lotto(1, 2, 3, 4, 4) }
    }
}