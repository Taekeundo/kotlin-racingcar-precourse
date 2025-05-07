package racingcar

import racingcar.view.InputView
import racingcar.view.OutputView
import camp.nextstep.edu.missionutils.Randoms

fun main() {

    /* (1) Input(1) carNames */
    println("Enter the names of the cars (comma-separated):")
    val carNames = InputView.readCarNames()
    validateCarNames(carNames)

    /* (2) Input(2) nMoves */
    println("How many rounds will be played?")
    val nMovesInput = InputView.readNumberOfMoves()
    validateNumberOfMoves(nMovesInput)
    val nMoves = nMovesInput.toInt()
    println()

    // println("Valid number of moves: $nMoves")

    /* (3) Service: generate & save */
    val carList = carNames.map { Car(it) }

    /* (4) Start Racing */
    println("Race Results")
    repeat(nMoves) {
        carList.forEach { car ->
            val randomNumber = Randoms.pickNumberInRange(0, 9)
            if (randomNumber >= 4)
                car.move()
        }
        carList.forEach { car ->
            println("${car.name} : ${"-".repeat(car.position)}")
        }
        println()
    }

    /* (5) Find winner */
    val maxPosition: Int = carList.maxOf { it.position }

    val winners: List<String> = carList
        .filter { it.position == maxPosition }
        .map { it.name }

    println("Winners : ${winners.joinToString(", ")}")
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

class Car(val name: String) {
    var position: Int = 0

    fun move() {
        position++
    }
}