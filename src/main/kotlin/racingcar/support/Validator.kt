package racingcar.support

import racingcar.domain.ValidationError

object Validator {

    fun validateCarNames(carNames: List<String>) {
        carNames.forEach { name ->
            if ((name.isEmpty())) {
                throw IllegalArgumentException(ValidationError.ERROR_EMPTY_NAME.message)
            }
            if (name.length > 5) {
                throw IllegalArgumentException(ValidationError.ERROR_TOO_LONG_NAME.message)
            }
        }
    }

    fun validateNumberOfMoves(input: String) {
        val number = input.toIntOrNull()
            ?: throw IllegalArgumentException(ValidationError.ERROR_INVALID_NUMBER.message)

        if (number <= 0) {
            throw IllegalArgumentException(ValidationError.ERROR_NUMBER_NEGATIVE.message)
        }
    }
}

/** [ enum사용 안하고 직접 오브젝트 내부에 선언할 경우 아래와 예시 참고 ]
 *  private const val ERROR_EMPTY_NAME = "Car name cannot be empty."
 *  private const val ERROR_TOO_LONG_NAME = "Car name must be 5 characters or less."
 *  private const val ERROR_INVALID_NUMBER = "Number of moves must be a valid integer."
 *  private const val ERROR_NUMBER_NEGATIVE = "Number of moves must be greater than 0."
 */