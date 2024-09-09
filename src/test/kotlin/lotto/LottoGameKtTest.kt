package lotto

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

private fun createLotto(numbers: List<Int>): List<LottoNumber> {
    return numbers.map(::LottoNumber)
}

private fun createLotto(vararg numbers: Int): List<LottoNumber> {
    return numbers.map(::LottoNumber)
}

// 확장함수: 원래 있는 함수인것처럼 함수를 만듦
private fun List<Int>.toLotto(): List<LottoNumber> {
//    return this.map(::LottoNumber)
    return map(::LottoNumber)
}

class LottoGameKtTest {
    @Test
    fun `1등`() {
        val userLotto = createLotto(listOf(1, 2, 3, 4, 5, 6))
        val winningLotto = createLotto(listOf(1, 2, 3, 4, 5, 6))
        val bonusNumber = LottoNumber(7)
        val actual = match2(userLotto, winningLotto, bonusNumber)
        actual shouldBe 1
    }

    @Test
    fun `2등`() {
        val userLotto = listOf(1, 2, 3, 4, 5, 7).toLotto()
        val winningLotto = listOf(1, 2, 3, 4, 5, 6).toLotto()
        val bonusNumber = LottoNumber(7)
        val actual = match2(userLotto, winningLotto, bonusNumber)
        actual shouldBe 2
    }

    @Test
    fun `3등`() {
        val userLotto = createLotto(listOf(1, 2, 3, 4, 5, 8))
        val winningLotto = createLotto(listOf(1, 2, 3, 4, 5, 6))
        val bonusNumber = LottoNumber(7)
        val actual = match2(userLotto, winningLotto, bonusNumber)
        actual shouldBe 3
    }

    @Test
    fun `4등`() {
        val userLotto = createLotto(listOf(1, 2, 3, 4, 9, 10))
        val winningLotto = createLotto(listOf(1, 2, 3, 4, 5, 6))
        val bonusNumber = LottoNumber(7)
        val actual = match2(userLotto, winningLotto, bonusNumber)
        actual shouldBe 4
    }

    @Test
    fun `5등`() {
        val userLotto = createLotto(listOf(1, 2, 5, 8, 9, 10))
        val winningLotto = createLotto(listOf(1, 2, 3, 4, 5, 6))
        val bonusNumber = LottoNumber(7)
        val actual = match2(userLotto, winningLotto, bonusNumber)
        actual shouldBe 5
    }

}