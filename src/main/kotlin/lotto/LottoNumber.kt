package lotto

data class LottoNumber(private val number: Int) {
    init {
//        require((1..45).contains(number)) { "로또 번호는 1부터 45까지 입니다." }
        require(number in 1..45) { "로또 번호는 1부터 45까지 입니다." }
    }

}