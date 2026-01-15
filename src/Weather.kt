data class Weather(
    private val temperature: Double,
    private val humidity: Int,
    private val weatherCode: Int,
    private val precipitation: Int,
    private val windSpeed: Int,
    private val windDirection: Int,
    private val apparentTemperature: Double,
    private val hourlyList: List<HourlyData>,
    private val dailyList: List<DailyData>) {

    fun getCurrentWeatherDataAll() : List<Any> = listOf(temperature, apparentTemperature, humidity, precipitation, windSpeed, windDirection, weatherCode)
        //println("$temperature\n$apparentTemperature\n$humidity\n$precipitation\n$windSpeed\n$windDirection\n$weatherCode")
    fun getHourlyWeatherDataAll() = hourlyList
    fun getDailyWeatherDataAll() = dailyList
}