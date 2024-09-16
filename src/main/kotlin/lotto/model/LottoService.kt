package lotto.model

private const val LOTTO_NUMBER_COUNT: Int = 6

object LottoService {
    fun getCountOfLotto(purchaseAmount: Int): Int {
        return purchaseAmount / 1000
    }

    fun createLotto(): Lotto {
        return Lotto()
    }

    fun getRank(lotto: Set<Int>, winLotto: Set<Int>, bonusNumber: Int): Int {
        val matchCount = lotto.intersect(winLotto).size

        if (matchCount == 6) {
            return 1
        }
        if (matchCount == 5 && winLotto.contains(bonusNumber)) {
            return 2
        }
        if (matchCount == 5) {
            return 3
        }
        if (matchCount == 4) {
            return 4
        }
        if (matchCount == 3) {
            return 5
        }
        return 6
    }

    fun getTotalWinning(rankCntList: List<Int>, purchaseAmount: Int): Int {
        val totalWinning = rankCntList.zip(winning.values()) { count, winning -> count * winning.money }.sum()
        return totalWinning
    }
}