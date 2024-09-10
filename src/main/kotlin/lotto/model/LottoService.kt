package lotto.model

private const val LOTTO_NUMBER_COUNT: Int = 6

class LottoService {
    fun getCountOfLotto(purchaseAmount: Int): Int {
        return purchaseAmount / 1000
    }

    fun createLotto(): Lotto {
        val lotto = Lotto()
        return lotto
    }
}
