package racingcar.support

import racingcar.domain.AppConfig
import racingcar.domain.Car
import racingcar.view.InputView
import racingcar.view.OutputView

object AppInitializer {

    fun initialize(): AppConfig {
        val carNames = getCarNames()
        val nMoves = getNumberOfMoves()
        val carList = carNames.map { Car(it) }
        val config = AppConfig(carList, nMoves)
        return config
    }

    private fun getCarNames() : List<String> {
        OutputView.askCarNames()
        val inputCarNames = InputView.readCarNames()
        val carNames = CarNameParser.parse(inputCarNames)
        Validator.validateCarNames(carNames)
        return carNames
    }

    private fun getNumberOfMoves() : Int {
        OutputView.askNumberOfMoves()
        val inputNumberOfMoves = InputView.readNumberOfMoves()
        Validator.validateNumberOfMoves(inputNumberOfMoves)
        val nMoves = inputNumberOfMoves.toInt()
        OutputView.printNewLine()
        return nMoves
    }
}