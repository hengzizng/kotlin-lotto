package lotto

class Rank(
    private val matchCount: Int,
    private val matchBonus: Boolean
) {
    fun toInt(): Int {
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
}