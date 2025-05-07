package racingcar.service

import camp.nextstep.edu.missionutils.Randoms

import racingcar.domain.Car
import racingcar.view.OutputView

object MoveCars {
    fun moveEachCar(carList: List<Car>, nMoves: Int) {
        repeat(nMoves) {
            carList.forEach { car ->
                tryMove(car)
            }
            OutputView.printCarPositions(carList.map { it.name to it.position })
        }
    }

    fun tryMove(car: Car) {
        val randomNumber = Randoms.pickNumberInRange(0, 9)
        if (randomNumber >= 4)
            car.move()
    }
}