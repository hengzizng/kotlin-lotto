package lotto

class WinningLotto(
    val lotto: Lotto,
    val bonus: LottoNumber,
) {
    init {
        require(!lotto.contains(bonus))
    }

    fun rank(lotto: Lotto): Int {
        val matchCount = lotto.match(lotto)
        val matchBonus = lotto.contains(bonus)
        return rank(matchCount, matchBonus)
    }

    fun rank(matchCount: Int, matchBonus: Boolean): Int {
        if (matchCount == 6) {
            return 1
        }
        if (matchCount == 5 && matchBonus) {
            return 2
        }
        if (matchCount > 2) {
            return 6 - matchCount + 2
        }
        return 0
    }
}
