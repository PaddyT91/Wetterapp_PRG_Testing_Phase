/*
  Projekt:      Wetterapp
  Firma:        ABB Technikerschule
  Autor:        Tobias Graf

  Beschreibung: File Handler
 */

class FileHandler {
    private var number = 1
    private val dataFile = File("File", number)

    fun work()  {
        dataFile.startFileInterface()

        if (dataFile.running) {
            LocationList.add("Thun")
            WeatherList.add("Sonnenschein")
            dataFile.readStoredWeather()
            dataFile.readStoredLocation()
        }
        else {
            println("File already exists")
        }
    }
}