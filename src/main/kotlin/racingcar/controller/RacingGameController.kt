package racingcar.controller

import racingcar.view.OutputView
import racingcar.service.MoveCars
import racingcar.domain.RaceResult
import racingcar.support.AppInitializer
import racingcar.service.WinnerCalculator

/**
 *  [ Execution flow ]
 *  1. AppInitializer   - 사용자 입력 수집 & 검증 // APP실행에 필요한 모든 초기값을 하나의 config 데이터클래스에 묶어서 저장.
 *  2. Execute logic(1) - move로직 실행 & 각 라운드 결과를 RoundResult(name, position)에 저장. // 데이트클래스
 *     Execute logic(2) - calc로직 실행 & 최종 우승자 목록을 winners에 저장.
 *  3. Compose Result   - 두 로직 결과를 하나의 RaceResult 데이터 클래스로 묶어서 저장.
 *  4. Print result     - 결과 출력
 */
class RacingGameController {
    fun run () {
        // 1. AppInitializer
        val config = AppInitializer.initialize()

        // 2. Execute logics
        val roundResults = MoveCars.moveEachCar(config.cars, config.nMoves)
        val winners = WinnerCalculator.calculateWinners(config.cars)

        // 3. Compose results from logics
        val raceResult = RaceResult(roundResults, winners)

        // 4. Print final result
        OutputView.printRaceResult(raceResult)
    }
}