package racingcar.support

object CarNameParser {
    fun parse(input: String): List<String> {
        val result = input.split(",")
            .map { it.trim() }
        return result
    }
}