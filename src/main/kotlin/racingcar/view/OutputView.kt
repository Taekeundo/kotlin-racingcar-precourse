package racingcar.view

import racingcar.domain.RaceResult

object OutputView {
    fun askCarNames() {
        println("Enter the names of the cars (comma-separated):")
    }

    fun askNumberOfMoves() {
        println("How many rounds will be played?")
    }

    fun printRaceResultsHeader() {
        println("Race Results")
    }

    fun printCarPositions(carStatus: List<Pair<String, Int>>) {
        val result = carStatus.map { (name, position) -> "$name : ${"-".repeat(position)}" }
        result.forEach { println(it) }
        println()
    }

    fun printWinners(winners: List<String>) {
        println("Winners : ${winners.joinToString(", ")}")
    }

    fun printNewLine() {
        println()
    }

    fun printRaceResult(result: RaceResult) {
        printRaceResultsHeader()
        result.roundResult.forEach { round ->
            printCarPositions(round.positions.map { it.name to it.position })
        }
        printWinners(result.winners)
    }
}