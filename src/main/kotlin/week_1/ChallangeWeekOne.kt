package week_1

import ChallangeQuestion
import java.time.LocalDate

class ChallangeWeekOne : ChallangeQuestion {

    override fun easyQuestion() {
        print("Please enter your birthday:")
        val birthday = readln().toInt()
        val yearNow = LocalDate.now().year
        println("He's ${yearNow - birthday} years old.")

    }

    override fun mediumQuestion() {
        print("Please enter some text: ")
        val mapOfRepeatLetter = mutableMapOf<Char, Int>()
        val input = readln()
        input.forEach { letter ->
            mapOfRepeatLetter[letter] = mapOfRepeatLetter[letter]?.plus(1) ?: 1
        }
        val maxRepeatLetter = mapOfRepeatLetter.maxBy {
            it.value
        }.key

        println("The max repeat letter is '$maxRepeatLetter'")
    }

    override fun hardQuestion() {
    }
}