package study;

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test;

/**
 * 1. 어떻게 만들지 디자인
 * introduce {
 *   name("김혜지")
 *   company("현대오토에버")
 *   skills {
 *     soft("A passion for problem solving")
 *     soft("Good communication skills")
 *     hard("Kotlin")
 *   }
 *   languages {
 *     "Korean" level 5
 *     "English" level 3
 *   }
 * }
 */
class DslTest {
    @Test
    fun name() {
        val actual: Person = introduce {
            name("김혜지") // = this.name("김혜지")
        }
        actual.name shouldBe "김혜지"
    }

    // this 사용의 대상: Person
    // block: 파라미터로 넘어오는 함수의 이름
    private fun introduce(block: Person.() -> Unit): Person {
        // 아래 1 ~ 4는 모두 동일한 값을 return
//        // 1
//        val person = Person("")
//        person.block()
//        return person
//        // 2
//        val person = Person("")
//            .apply { block() }
//        return person
//        // 3
//        return Person("").apply { block() }
        // 4
        return Person("").apply(block)
    }
}

class Person(var name: String) {
    fun name(name: String) {
        this.name = name
    }
}
