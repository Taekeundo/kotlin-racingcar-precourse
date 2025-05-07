package racingcar

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.assertj.core.api.Assertions.assertThat
import camp.nextstep.edu.missionutils.test.NsTest

/**
 *  [ Test index ]
 *  1. Valid input                      Basic(Valid)
 *  2. Car name exceeds 5 characters    Invalid
 *  3. Car name is empty                Invalid
 *  4. nMove is 0                       Edge + Invalid
 *  5. nMove is not a number type       Invalid
 */
class RacingGameTest : NsTest() {

    @Test
    fun `Given valid car names and move count When race starts Then cars move and winners are printed`() {
        run("pobi,woni", "3")
        assertThat(output()).contains("pobi", "woni")
        assertThat(output()).contains("Winners :")
    }

    @Test
    fun `Given car name longer than 5 characters When input is validated Then IllegalArgumentException is thrown`() {
        val exception = assertThrows<IllegalArgumentException> {
            run("abcdef", "3")
        }
        assertThat(exception.message).isEqualTo("Car name must be 5 characters or less.")
    }

    @Test
    fun `Given empty car name When input is validated Then IllegalArgumentException is thrown`() {
        val exception = assertThrows<IllegalArgumentException> {
            run(",", "3")
        }
        assertThat(exception.message).isEqualTo("Car name cannot be empty.")
    }

    @Test
    fun `Given move count as 0 When input is validated Then IllegalArgumentException is thrown`() {
        val exception = assertThrows<IllegalArgumentException> {
            run("pobi,woni", "0")
        }
        assertThat(exception.message).isEqualTo("Number of moves must be greater than 0.")
    }

    @Test
    fun `Given move count as non-integer When input is validated Then IllegalArgumentException is thrown`() {
        val exception = assertThrows<IllegalArgumentException> {
            run("pobi,woni", "abc")
        }
        assertThat(exception.message).isEqualTo("Number of moves must be a valid integer.")
    }

    override fun runMain() {
        main()
    }
}