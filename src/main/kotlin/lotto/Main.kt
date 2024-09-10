package lotto

import lotto.controller.LottoController
import lotto.model.Lotto
import lotto.view.InputView

fun main() {
    val inputView = InputView()
    val lottoController = LottoController()

    println("구입금액을 입력해주세요")
    val purchaseAmount = inputView.inputPurchaseAmount()
    if (purchaseAmount == 0) return

    val cnt = lottoController.getCountOfLotto(purchaseAmount)
    println("$cnt 개를 구매했습니다")

    val lottoList: MutableList<Lotto> = mutableListOf()
    for (i in 0 until cnt) {
        lottoList.add(lottoController.createLotto())
    }

    for (l in lottoList) {
        for (i in l.lottoNumbers) {
            print("${i.number} ")
        }
        println()
    }
}
