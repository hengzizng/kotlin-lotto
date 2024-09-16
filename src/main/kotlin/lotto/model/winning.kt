package lotto.model

enum class winning(val money: Int) {
    first(2000000000),
    second(30000000),
    third(1500000),
    fourth(50000),
    fifth(5000)

    /*
3개 일치 (5000원)- 1개
4개 일치 (50000원)- 0개
5개 일치 (1500000원)- 0개
5개 일치, 보너스 볼 일치(30000000원) - 0개
6개 일치 (2000000000원)- 0개
     */
}