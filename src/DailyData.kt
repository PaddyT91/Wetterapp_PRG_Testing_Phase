import java.time.LocalDate
import java.time.LocalDateTime

data class DailyData(
    private val time: LocalDate,
    private val temperatureMin: Double,
    private val temperatureMax: Double,
    private val apparentTemperatureMin: Double,
    private val apparentTemperatureMax: Double,
    private val sunset: LocalDateTime,
    private val sunrise: LocalDateTime,
    private val weatherCode: Int) {

    fun get(): List<Any> {
        return listOf(time, temperatureMin, temperatureMax, apparentTemperatureMin, apparentTemperatureMax, sunset, sunrise, weatherCode)
    }
}
