package racingcar.service

import racingcar.domain.Car

object WinnerCalculator {
    fun calculateWinners(carList: List<Car>): List<String> {
        val maxPosition: Int = carList.maxOf { it.position }
        val winners: List<String> = carList
            .filter { it.position == maxPosition }
            .map { it.name }
        return winners
    }
}