package lotto.controller

import lotto.model.Lotto
import lotto.model.LottoService

class LottoController {
    fun getCountOfLotto(purchaseAmount: Int): Int {
        return LottoService.getCountOfLotto(purchaseAmount)
    }

    fun createLotto(): Lotto {
        return LottoService.createLotto()
    }
}
