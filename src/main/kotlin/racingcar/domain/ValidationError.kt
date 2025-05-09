package racingcar.domain

enum class ValidationError (val message: String) {
    ERROR_EMPTY_NAME("Car name cannot be empty."),
    ERROR_TOO_LONG_NAME("Car name must be 5 characters or less."),
    ERROR_INVALID_NUMBER("Number of moves must be a valid integer."),
    ERROR_NUMBER_NEGATIVE("Number of moves must be greater than 0.")
}