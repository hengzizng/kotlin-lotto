package lotto

import lotto.controller.LottoController
import lotto.model.Lotto
import lotto.view.InputView

class Main {
    fun main() {
        val inputView = InputView()
        val lottoController = LottoController()

        val purchaseAmount = inputView.inputPurchaseAmount()
        if(purchaseAmount == 0) return

        lottoController.getCountOfLotto(purchaseAmount)
    }
}