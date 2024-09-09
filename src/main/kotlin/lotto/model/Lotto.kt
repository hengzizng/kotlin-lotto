package lotto.model

class Lotto {
    fun getCountOfLotto(purchaseAmount : Int): Int{
        return purchaseAmount / 1000;
    }
}