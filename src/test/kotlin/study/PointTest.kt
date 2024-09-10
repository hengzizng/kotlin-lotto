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

    @Test
    fun test4() {
        val point = Point(1, 3)
        val x = point["x"]
        val y = point["y"]
    }

    @Test
    fun test5() {
        val builder = StringBuilder()
        builder.apply { // .append("a").append("b") 와 같음
            append("a") // = this.append("a")
            append("b")
            append("c")
        }

        builder
            .apply { append("a") } // apply에서는 type이 함수로 쓰이기 떄문에 this 사용 가능
            .also { println(it.toString()) } // also에서는 파라미터로 쓰이기 때문에 this 사용하지 못하고, it로 사용
    }
}
