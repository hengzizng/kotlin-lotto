package lotto

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class WinningLottoTest {
    @Test
    fun test1() {
        assertThrows<IllegalArgumentException> {
            WinningLotto(
                Lotto(1, 2, 3, 4, 5, 6),
                LottoNumber(6)
            )
        }
    }
}
