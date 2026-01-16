/*
  Projekt:      Wetterapp
  Firma:        ABB Technikerschule
  Autor:        Tobias Graf

  Beschreibung: Interface Speichern Daten
*/

interface Fileinterface {
    fun startFileInterface()
    fun readStoredWeather()
    fun readStoredLocation()
    fun readFileList(): MutableList<File>
    fun storeWeather(weather: WeatherData) {}
    fun storeLocation(location: LocationData) {}
    fun storeFileList(): List<File>
    fun clearOldData()
    fun checkAccuracy()
}