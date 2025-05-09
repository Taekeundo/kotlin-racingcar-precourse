package racingcar.service

object Validator {
    fun validateCarNames(carNames: List<String>) {
        carNames.forEach { name ->
            if ((name.isEmpty())) {
                throw IllegalArgumentException("Car name cannot be empty.")
            }
            if (name.length > 5) {
                throw IllegalArgumentException("Car name must be 5 characters or less.")
            }
        }
    }

    fun validateNumberOfMoves(input: String) {
        val number = input.toIntOrNull()
            ?: throw IllegalArgumentException("Number of moves must be a valid integer.")

        if (number <= 0) {
            throw IllegalArgumentException("Number of moves must be greater than 0.")
        }
    }
}