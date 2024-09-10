package lotto

// value class 는 property를 하나밖에 못가짐
@JvmInline
value class LottoNumber2(private val number: Int) {
    init {
        require(number in 1..45)
    }
}
