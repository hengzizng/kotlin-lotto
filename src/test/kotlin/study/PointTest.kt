package study

import org.junit.jupiter.api.Test

class PointTest {
    @Test
    fun test1() {
        val point1 = Point(1, 3)
        val point2 = Point(3, 5)
        val point3 = point1.plus(point2)
        // Point의 plus 함수에 operator를 붙였기 때문에 가능
        val point4 = point1 + point2
        // Collection의 + - 도 이렇게 구현되어있음
    }
}
