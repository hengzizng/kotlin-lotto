package lotto.controller

import lotto.model.Lotto

class LottoController {
    private val lotto = Lotto()
    fun getCountOfLotto(purchaseAmount : Int): Int{
        return lotto.getCountOfLotto(purchaseAmount)
    }
}