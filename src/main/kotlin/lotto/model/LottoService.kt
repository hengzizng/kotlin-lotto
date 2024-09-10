package lotto.model

private const val LOTTO_NUMBER_COUNT: Int = 6

class LottoService {
    fun getCountOfLotto(purchaseAmount: Int): Int {
        return purchaseAmount / 1000
    }

    fun createLotto(): Lotto {
        val lotto = Lotto(mutableSetOf())

        while (lotto.lottoNumbers.size < LOTTO_NUMBER_COUNT) {
            var number = (1..45).random()
            lotto.lottoNumbers.add(LottoNumber(number))
        }
        return lotto
    }
}
