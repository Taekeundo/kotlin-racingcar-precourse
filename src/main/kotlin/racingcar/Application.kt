package racingcar

import camp.nextstep.edu.missionutils.Console

fun main() {
    println("Enter the names of the cars (comma-separated):")
    val carLists = Console.readLine()
        .split(",")
        .map { it.trim() }

    validateCarNames(carLists)

    println("Valid car names: $carLists")
}

fun validateCarNames(carNames: List<String>) {
    carNames.forEach { name ->
        if ((name.isEmpty())) {
            throw IllegalArgumentException("Car name cannot be empty.")
        }
        if (name.length > 5) {
            throw IllegalArgumentException("Car name must be 5 characters or less.")
        }
    }
}

