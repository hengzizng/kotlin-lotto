package study

import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

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

    @Test
    fun skills() {
        val actual = introduce {
            name("김혜지")
            company("현대자동차그룹")
            skills {
                soft("A passion for problem solving")
                soft("Good communication skills")
                hard("Kotlin")
            }
        }

        actual.name shouldBe "김혜지"
        actual.company shouldBe "현대자동차그룹"
        actual.skills?.shouldContain(SoftSkill("A passion for problem solving"))
    }

    @Test
    fun languages() {
        val actual = introduce {
            name("김혜지")
            company("현대자동차그룹")
            skills {
                soft("A passion for problem solving")
                soft("Good communication skills")
                hard("Kotlin")
            }
            languages {
                "Korean" level 5
                "English" level 3
            }
        }

        actual.name shouldBe "김혜지"
        actual.company shouldBe "현대자동차그룹"
        actual.skills?.shouldContain(SoftSkill("A passion for problem solving"))
        actual.languages?.shouldContain(Language("Korean", 5))
    }

    // this 사용의 대상: Person
    // block: 파라미터로 넘어오는 함수의 이름
    // Unit: return type이 void
    private fun introduce(block: PersonBuilder.() -> Unit): Person {
        return PersonBuilder().apply(block).build()
    }
}

class PersonBuilder(
    private var name: String = "",
    private var company: String? = null,
    private var skills: MutableList<Skill>? = null,
    private var languages: MutableSet<Language>? = null,
) {
    fun name(name: String) {
        this.name = name
    }

    fun company(company: String?) {
        this.company = company
    }

    fun skills(block: SkillsBuilder.() -> Unit): MutableList<Skill> {
        return SkillsBuilder().apply(block).build()
    }

    fun languages(block: LanguagesBuilder.() -> Unit): MutableSet<Language> {
        return LanguagesBuilder().apply(block).build()
    }

    fun build(): Person {
        return Person(name, company, skills, languages)
    }
}

data class Person(
    val name: String,
    val company: String?,
    val skills: MutableList<Skill>?,
    val languages: MutableSet<Language>?,
)

class SkillsBuilder(
    private var skills: MutableList<Skill> = mutableListOf(),
) {
    fun soft(title: String) {
        skills.add(SoftSkill(title))
    }

    fun hard(title: String) {
        skills.add(HardSkill(title))
    }

    fun build(): MutableList<Skill> {
        return skills
    }
}

interface Skill
class SoftSkill(val title: String) : Skill
class HardSkill(val title: String) : Skill

class LanguagesBuilder(
    private var languages: MutableSet<Language> = mutableSetOf(),
) {
    infix fun String.level(level: Int) {
        languages.add(Language(this, level))
    }

    fun build(): MutableSet<Language> {
        return languages
    }
}

class Language(val language: String, val level: Int)
