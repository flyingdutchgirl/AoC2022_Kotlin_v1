package utils

import base.Task
import tasks.day01.Calories
import tasks.day02.RockPaperScissors
import tasks.day03.Rucksacks
import tasks.day04.Overlapping

val allTasks = listOf<Task>(
    // day 1
    Calories(),

    // day 2
    RockPaperScissors(),

    // day 3
    Rucksacks(),

    // day 4
    Overlapping(),


    )

fun testAll() {
    allTasks.forEach(::testAssertions)
}

fun main() {
    testAll()
}