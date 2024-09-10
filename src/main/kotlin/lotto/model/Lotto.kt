package lotto.model

class Lotto() {
    var lottoNumbers: Set<LottoNumber> = createLotto()

    init {
        while (lottoNumbers.size < 6) {
            lottoNumbers = createLotto()
        }
    }

    private fun createLotto(): Set<LottoNumber> {
        return (1..6)
            .map { (1..45).random() }
            .map { LottoNumber(it) }
            .toSet()
    }
}
