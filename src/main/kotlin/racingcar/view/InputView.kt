package racingcar.view

import camp.nextstep.edu.missionutils.Console

object InputView {

    fun readCarNames(): List<String> {
        return Console.readLine()
            .split(",")
            .map { it.trim() }
    }

    fun readNumberOfMoves(): String {
        val input = Console.readLine()
        return input
    }
}