package lotto

data class LottoNumber(private val number: Int) {
    init {
//        require((1..45).contains(number)) { "로또 번호는 1부터 45까지 입니다." }
        require(number in 1..45) { "로또 번호는 1부터 45까지 입니다." }
    }

    // factory function를 통해 45개의 숫자 객체를 만들어두고, 재사용함
    companion object {
        private val NUMBERS: Map<Int, LottoNumber> = (1..45).associateWith(::LottoNumber)

        fun from(number: Int): LottoNumber {
            return NUMBERS[number] ?: throw IllegalArgumentException()
        }
    }
}
