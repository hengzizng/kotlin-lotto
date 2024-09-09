package lotto

class Lotto(private val numbers: List<LottoNumber>) {
    init {
        require(numbers.distinct().size == 6)
    }

    constructor(vararg numbers: Int): this(numbers.map(::LottoNumber))
}