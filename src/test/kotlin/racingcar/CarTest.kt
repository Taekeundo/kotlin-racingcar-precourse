package racingcar

import racingcar.domain.Car

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

/**
 *  [ Test index ]
 *  1. car.move         Basic(valid)
 */
class CarTest {

    @Test
    fun `Car moves forward when move() is called`() {
        val car = Car("pobi")
        car.move()
        car.move()

        assertThat(car.position).isEqualTo(2)
    }
}