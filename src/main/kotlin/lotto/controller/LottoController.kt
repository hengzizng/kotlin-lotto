package lotto.controller

import lotto.model.Lotto
import lotto.model.LottoService

class LottoController {
    private val lottoService = LottoService()

    fun getCountOfLotto(purchaseAmount : Int): Int{
        return lottoService.getCountOfLotto(purchaseAmount)
    }
}