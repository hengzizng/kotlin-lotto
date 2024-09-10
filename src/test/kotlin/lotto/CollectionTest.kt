package lotto

import org.junit.jupiter.api.Test

class CollectionTest {
    @Test
    fun test1() {
        val numbers = mutableListOf<Int>()
        numbers.add(1)
        numbers.add(2)
        numbers.add(3)
    }

    @Test
    fun test2() {
        val numbers = listOf<Int>()
        numbers + 1 // = numbers.plus(1)
        numbers + 2 // = numbers.plus(2)
        numbers + 3 // = numbers.plus(3)
    }
}
