package racingcar.domain

// Car's position in a specific round.
// Each car has its name and position per round.
data class CarPosition(
    val name: String,
    val position: Int
)

// Result of a single round, including all car's positions.
// Each round has all car's positions.
data class RoundResult(
    val positions: List<CarPosition>
)

// Overall race result: all round results and final winners.
// Race has result of all round's positions from each car.
data class RaceResult(
    val roundResult: List<RoundResult>,
    val winners: List<String>
)