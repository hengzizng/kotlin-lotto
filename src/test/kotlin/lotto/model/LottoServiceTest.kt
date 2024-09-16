package lotto.model

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import java.text.DecimalFormat

class LottoServiceTest {
    @Test
    fun `1등`() {
        val winLotto = setOf(1, 2, 3, 4, 5, 6)
        val bonusNumber = 7
        val testLotto = setOf(1, 2, 3, 4, 5, 6)

        val actual = LottoService.getRank(testLotto, winLotto, bonusNumber)
        actual shouldBe 1
    }

    @Test
    fun `2등`() {
        val winLotto = setOf(1, 2, 3, 4, 5, 7)
        val bonusNumber = 7
        val testLotto = setOf(1, 2, 3, 4, 5, 6)

        val actual = LottoService.getRank(testLotto, winLotto, bonusNumber)
        actual shouldBe 2
    }

    @Test
    fun `3등`() {
        val winLotto = setOf(1, 2, 3, 4, 5, 8)
        val bonusNumber = 7
        val testLotto = setOf(1, 2, 3, 4, 5, 6)

        val actual = LottoService.getRank(testLotto, winLotto, bonusNumber)
        actual shouldBe 3
    }

    @Test
    fun `4등`() {
        val winLotto = setOf(1, 2, 3, 4, 8, 9)
        val bonusNumber = 7
        val testLotto = setOf(1, 2, 3, 4, 5, 6)

        val actual = LottoService.getRank(testLotto, winLotto, bonusNumber)
        actual shouldBe 4
    }

    @Test
    fun `5등`() {
        val winLotto = setOf(1, 2, 3, 8, 9, 10)
        val bonusNumber = 7
        val testLotto = setOf(1, 2, 3, 4, 5, 6)

        val actual = LottoService.getRank(testLotto, winLotto, bonusNumber)
        actual shouldBe 5
    }

    @Test
    fun `꽝`() {
        val winLotto = setOf(1, 2, 8, 9, 10, 11)
        val bonusNumber = 7
        val testLotto = setOf(1, 2, 3, 4, 5, 6)

        val actual = LottoService.getRank(testLotto, winLotto, bonusNumber)
        actual shouldBe 6
    }

    @Test
    fun `수익률`() {
        val rankCntList = listOf(0, 0, 2, 1, 0)
        val purchaseAmount = 10000
        val totalWinning = LottoService.getTotalWinning(rankCntList, purchaseAmount)
        val rate = totalWinning.toDouble() / purchaseAmount.toDouble()
        val actual = DecimalFormat("#.##").format(rate).toDouble()
        actual shouldBe 305.00
    }
}
