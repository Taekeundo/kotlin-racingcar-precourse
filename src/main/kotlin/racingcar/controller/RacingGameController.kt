package racingcar.controller

import racingcar.domain.Car
import racingcar.view.InputView
import racingcar.view.OutputView
import racingcar.service.MoveCars
import racingcar.service.Validator
import racingcar.service.WinnerCalculator

class RacingGameController {
    fun run () {
        val carNames = getCarNames()
        val nMoves = getNumberOfMoves()
        val carList = carNames.map { Car(it) }

        OutputView.printRaceResultsHeader()
        MoveCars.moveEachCar(carList, nMoves)
        val winners : List<String> = WinnerCalculator.calculateWinners(carList)
        OutputView.printWinners(winners)
    }

    fun getCarNames() : List<String> {
        OutputView.askCarNames()
        val carNames = InputView.readCarNames()
        Validator.validateCarNames(carNames)
        return carNames
    }

    fun getNumberOfMoves() : Int {
        OutputView.askNumberOfMoves()
        val nMovesInput = InputView.readNumberOfMoves()
        Validator.validateNumberOfMoves(nMovesInput)
        val nMoves = nMovesInput.toInt()
        OutputView.printNewLine()
        return nMoves
    }
}