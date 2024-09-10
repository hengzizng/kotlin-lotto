package lotto

/**
 * > 제약사항
 * 로또 번호는 1부터 45까지
 * 한 장의 로또는 6개ㅡ이 로또 번호로 이루어져 있다.
 * 한 장의 로또 번호는 중복될 수 없다.
 * 보너스 번호화 당첨 번호는 중복될 수 없다.
 */
fun match(
    userLotto: Lotto,
    winningLotto: WinningLotto
): Int {
    return winningLotto.rank(userLotto)
}
