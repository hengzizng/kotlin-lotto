package lotto.model

class Lotto() {
    var lottoNumbers: Set<LottoNumber> = createLotto()

    private fun createLotto(): Set<LottoNumber> {
        return (1..45).shuffled().take(6).map { LottoNumber(it) }.toSet()
    }
}
