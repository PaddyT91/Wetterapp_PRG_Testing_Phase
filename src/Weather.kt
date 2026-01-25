data class Weather(
    private val temperature: Double,
    private val humidity: Int,
    private val weatherCode: WeatherCodes,
    private val precipitation: Int,
    private val windSpeed: Int,
    private val windDirection: Int,
    private val apparentTemperature: Double,
    private val hourlyList: List<HourlyData>,
    private val dailyList: List<DailyData>) {

    val weatherCodeNumber: Int
       get() = weatherCode.code

    val weatherCodeDescription: String
        get() = weatherCode.description

    val weatherCodeIcon: String
        get() = weatherCode.icon





    fun getCurrentWeatherDataAll() : List<Any> = listOf(temperature, apparentTemperature, humidity, precipitation, windSpeed, windDirection, "${weatherCodeNumber} ${weatherCodeDescription} ${weatherCodeIcon}")
        //println("$temperature\n$apparentTemperature\n$humidity\n$precipitation\n$windSpeed\n$windDirection\n$weatherCode")
    fun getHourlyWeatherDataAll() = hourlyList
    fun getDailyWeatherDataAll() = dailyList


}