package lotto.view

class InputView {
    fun inputPurchaseAmount(): Int {
        return readlnOrNull()?.toIntOrNull() ?: 0
    }
}