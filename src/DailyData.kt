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
    private val weatherCode: WeatherCodes ) {

    val weatherCodeNumber: Int
        get() = weatherCode.code

    val weatherCodeDescription: String
        get() = weatherCode.description

    val weatherCodeIcon: String
        get() = weatherCode.icon




    fun get(): List<Any> {
        return listOf(time, temperatureMin, temperatureMax, apparentTemperatureMin, apparentTemperatureMax, sunset, sunrise,  "${weatherCodeNumber}${weatherCodeDescription}${weatherCodeIcon}")
    }




}
