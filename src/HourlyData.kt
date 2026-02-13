import java.time.LocalDateTime

data class HourlyData(
    private val times: LocalDateTime,
    private val temperature2M: Double,
    private val apparentTemperature2M: Double,
    private val relativeHumidity2M: Int,
    private val precipitation: Double,
    private val windSpeed: Double,
    private val windDirection: Int,
    private val freezingLevel: Double,
    private val weatherCode: WeatherCodes)

