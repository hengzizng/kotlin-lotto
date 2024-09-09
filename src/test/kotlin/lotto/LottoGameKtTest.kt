package lotto

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LottoGameKtTest {
    @Test
    fun `1등`() {
        val userLotto = listOf(1, 2, 3, 4, 5, 6)
        val winningLotto = listOf(1, 2, 3, 4, 5, 6)
        val bonusNumber = 7
        val actual = match(userLotto, winningLotto, bonusNumber)
        actual shouldBe 1
    }
}