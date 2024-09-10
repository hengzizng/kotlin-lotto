package lotto.model

class Lotto(
    val lottoNumbers: MutableSet<LottoNumber>
) {
    init {
        require(lottoNumbers.size == 6)
    }

    constructor(lottoNumbers: MutableSet<Int>) : this(lottoNumbers.map(::LottoNumber).toMutableSet())
}
