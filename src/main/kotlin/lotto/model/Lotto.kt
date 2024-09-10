package lotto.model

class Lotto() {
    val lottoNumbers: Set<LottoNumber> = (1..6)
        .map { (1..45).random() }
        .map { LottoNumber(it) }
        .toSet()

    init {
        require(lottoNumbers.size == 6)
    }
}
