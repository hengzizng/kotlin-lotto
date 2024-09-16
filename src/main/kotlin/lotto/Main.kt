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

    // val lastWeekLotto = mutableListOf<LottoNumber>()
    println("지난주 당첨번호를 입력하세요")
    val input = readlnOrNull()

    // 입력된 문자열을 공백 기준으로 분리하여 숫자로 변환
    if (input != null) {
        val numbers = input.split(" ") // 공백을 기준으로 문자열을 분리
            .map { it.toInt() } // 각 문자열을 Int로 변환
    } else {
        println("입력이 잘못되었습니다.")
        return
    }

    println("보너스 볼 번호를 입력하세요")
    val bonus = readlnOrNull()?.toIntOrNull() ?: 0

    println("당첨통계")
    println("==================")
}
