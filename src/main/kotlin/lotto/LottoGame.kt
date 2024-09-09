package lotto

/**
 * > 제약사항
 * 로또 번호는 1부터 45까지
 * 한 장의 로또는 6개ㅡ이 로또 번호로 이루어져 있다.
 * 한 장의 로또 번호는 중복될 수 없다.
 * 보너스 번호화 당첨 번호는 중복될 수 없다.
 */
fun match(
    userLotto: List<Int>,
    winningLotto: List<Int>,
    bonusNumber: Int
): Int {
    val matchCount = match(userLotto, winningLotto)
    val matchBonus = userLotto.contains(bonusNumber)
    return rank(matchCount, matchBonus)
}

// 점진적 refactoring을 위해 사용
fun match2(
    userLotto: List<LottoNumber>,
    winningLotto: List<LottoNumber>,
    bonusNumber: LottoNumber
): Int {
    val matchCount = match2(userLotto, winningLotto)
    val matchBonus = userLotto.contains(bonusNumber)
    return rank(matchCount, matchBonus)
}

private fun match(
    userLotto: List<Int>,
    winningLotto: List<Int>
): Int {
    return userLotto.intersect(winningLotto.toSet()).size
}

// 점진적 refactoring을 위해 사용
private fun match2(
    userLotto: List<LottoNumber>,
    winningLotto: List<LottoNumber>
): Int {
    return userLotto.intersect(winningLotto.toSet()).size
}

private fun rank(matchCount: Int, matchBonus: Boolean): Int {
    if (matchCount == 6) {
        return 1
    }
    if (matchCount == 5 && matchBonus) {
        return 2
    }
    if (matchCount > 2) {
        return 6 - matchCount + 2
    }
    return 0
}

