package lotto.model

private const val LOTTO_NUMBER_COUNT: Int = 6

class LottoService {
    fun getCountOfLotto(purchaseAmount : Int): Int{
        return purchaseAmount / 1000;
    }

    fun createLotto(): Lotto {
        val lotto = Lotto(mutableListOf<LottoNumber>())

        for(i in 1 until LOTTO_NUMBER_COUNT) {
            var number = 0

//            lotto.lottoNumbers.contains(LottoNumber(number))
            do {
                number = (1..45).random()
            } while (lotto.lottoNumbers.any { it.number == number })
        }

    }
}