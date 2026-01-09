/*
  Projekt:      Wetterapp
  Firma:        ABB Technikerschule
  Autor:        Tobias Graf

  Beschreibung: Main
*/


val LocationList = mutableListOf<Any>()
val WeatherList = mutableListOf<Any>()
val FileList = mutableListOf<File>()

fun main(){
    val myOrt = ApiHandler()
    myOrt.getLocations("Wil")

    val dataFile = FileHandler()
    dataFile.work()

    println(WeatherCode.BEWOELKT)

}