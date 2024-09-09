package lotto

fun match(
    userLotto: List<Int>,
    winningLotto: List<Int>,
    bonusNumber: Int
): Int {
    val matchCount = userLotto.intersect(winningLotto.toSet()).size
    if (matchCount == 6) {
        return 1
    }
    val matchBonus = userLotto.contains(bonusNumber)
    if (matchCount == 5 && matchBonus) {
        return 2
    }
    if (matchCount > 2) {
        return 6 - matchCount + 2
    }
    return 0
}
