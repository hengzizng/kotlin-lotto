package lotto

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class RankTest {

    @Test
    fun `1등`() {
        val rank = Rank(6, false)
        val actual = rank.toInt()
        actual shouldBe 1
    }

    @Test
    fun `2등`() {
        val rank = Rank(5, true)
        val actual = rank.toInt()
        actual shouldBe 2
    }

    @Test
    fun `3등`() {
        val rank = Rank(4, true)
        val actual = rank.toInt()
        actual shouldBe 3
    }

    @Test
    fun `4등`() {
        val rank = Rank(3, true)
        val actual = rank.toInt()
        actual shouldBe 4
    }

    @Test
    fun `5등`() {
        val rank = Rank(2, true)
        val actual = rank.toInt()
        actual shouldBe 5
    }
}
