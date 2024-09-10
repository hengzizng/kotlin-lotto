package study

data class Point(private val x: Int, private val y: Int) {
    // 이미 존재하는 plus 함수를 변경함
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}
