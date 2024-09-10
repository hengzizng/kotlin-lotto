package lotto

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LottoNumber2Test {
    // 이 test가 성공하는 이유?
    // value class는 생성자가 private -> 생성자의 impl로 실행됨
    // 생성자로 생성되는 값이 인스턴스가 아닌 내부의 원래 값으로 return됨 (int)
    // -> heap memory를 차지하지 않음
    @Test
    fun name() {
        val number1 = LottoNumber2(1)
        val number2 = LottoNumber2(1)
        number1 shouldBe number2
    }
}
