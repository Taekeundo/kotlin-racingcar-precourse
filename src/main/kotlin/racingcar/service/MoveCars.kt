package racingcar.service

import camp.nextstep.edu.missionutils.Randoms

import racingcar.domain.Car
import racingcar.domain.CarPosition
import racingcar.domain.RoundResult

object MoveCars {
    fun moveEachCar(carList: List<Car>, nMoves: Int): List<RoundResult> {
        val roundResults = mutableListOf<RoundResult>()

        repeat(nMoves) {
            carList.forEach { car ->
                tryMove(car)
            }
            val positions = carList.map { CarPosition(it.name, it.position) }
            roundResults.add(RoundResult(positions))
        }
        return roundResults
    }

    private fun tryMove(car: Car) {
        val randomNumber = Randoms.pickNumberInRange(0, 9)
        if (randomNumber >= 4)
            car.move()
    }
}