import kotlin.Double

interface Api {
    fun fetchWeather(location: Location): Weather?
    fun fetchLocations(searchText: String): MutableList<Location>

}