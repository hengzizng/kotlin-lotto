package lotto

class Lotto(val numbers: Set<LottoNumber>) : Set<LottoNumber> by numbers {
    init {
        require(numbers.size == 6)
    }

    constructor(vararg numbers: Int) : this(numbers.map(::LottoNumber).toSet())

//    // 확장함수보다 멤버함수가 우선순위 더 높음 (interface에 선언된 함수도 포함)
//    // 위임 함수 (실제로 하는일은 없이 numbers에 위임함 = by 사용해서 Set이 하는 일을 위임함
//    fun contains(number: LottoNumber): Boolean = numbers.contains(number)

    fun match(lotto: Lotto): Int {
        return numbers.intersect(lotto.numbers.toSet()).size
    }
}
