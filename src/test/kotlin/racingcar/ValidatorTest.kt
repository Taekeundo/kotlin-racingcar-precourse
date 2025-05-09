package racingcar

import racingcar.support.Validator
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThatThrownBy

/**
 *  [ Test index ]
 *  1. Car name is empty                    Invalid
 *  2. Car name exceeds 5 characters        Invalid
 *  3. nMover is not a number type          Invalid
 */
class ValidatorTest {

    @Test
    fun `Car name empty should throw exception`() {
        val carNames = listOf("pobi", "")
        assertThatThrownBy { Validator.validateCarNames(carNames) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("Car name cannot be empty.")
    }

    @Test
    fun `Car name too long should throw exception`() {
        val carNames = listOf("pobi", "abcdef")
        assertThatThrownBy { Validator.validateCarNames(carNames) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("Car name must be 5 characters or less.")
    }

    @Test
    fun `Move count non-integer should throw exception`() {
        assertThatThrownBy { Validator.validateNumberOfMoves("abc") }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("Number of moves must be a valid integer.")
    }
}
