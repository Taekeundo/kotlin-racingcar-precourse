package racingcar

import camp.nextstep.edu.missionutils.Console

fun main() {
    // Input(1) carNames
    println("Enter the names of the cars (comma-separated):")
    val carLists = Console.readLine()
        .split(",")
        .map { it.trim() }

    validateCarNames(carLists)
    println("Valid car names: $carLists")

    // Input(2) nMoves
    println("How many rounds will be played?")
    val nMovesInput = Console.readLine()

    validateNumberOfMoves(nMovesInput)

    val nMoves = nMovesInput.toInt()

    println("Valid number of moves: $nMoves")
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

fun validateNumberOfMoves(input: String) {
    val number = input.toIntOrNull()
        ?: throw IllegalArgumentException("Number of moves must be a valid integer.")

    if (number <= 0) {
        throw IllegalArgumentException("Number of moves must be greater than 0.")
    }
}
