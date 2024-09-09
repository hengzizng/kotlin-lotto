package lotto

class Lotto(private val numbers: Set<LottoNumber>) {
    init {
        require(numbers.size == 6)
    }

    constructor(vararg numbers: Int): this(numbers.map(::LottoNumber).toSet())
}