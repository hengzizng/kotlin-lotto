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

    @Test
    fun company() {
        val actual = introduce {
            name("김혜지")
            company("현대자동차그룹")
        }

        actual.name shouldBe "김혜지"
        actual.company shouldBe "현대자동차그룹"
    }

    // this 사용의 대상: Person
    // block: 파라미터로 넘어오는 함수의 이름
    private fun introduce(block: PersonBuilder.() -> Unit): Person {
        return PersonBuilder().apply(block).build()
    }
}

class PersonBuilder(
    private var name: String = "",
    private var company: String? = null,
) {
    fun name(name: String) {
        this.name = name
    }

    fun company(company: String) {
        this.company = company
    }

    fun build(): Person {
        return Person(name, company)
    }
}

data class Person(val name: String, val company: String?)