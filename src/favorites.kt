object favorites {
    private val favorites = mutableListOf<String>()


    fun addFavorites(location : String) : Boolean {

        //kontrollieren, ob Ort schon vorhanden und Liste nicht grösser als 5, wenn nicht an freier Stelle hinzufügen
        if (favorites.contains(location)) {
            println("Ort bereits vorhanden!")
            return false
        }
        if (favorites.size > 5) {
            println("entferne ein Favoriten um einen Neuen zu erstellen")
            return false
        } else
            favorites.add(location)
            return true
    }

    fun removeFavorites(location: String): Boolean{
        if (favorites.contains(location)){
            favorites.remove(location)
            println("Favorit wurde aus Liste entfernt")
            return true
        }
        else println("es konnte kein Favorit entfernt werden")
            return false

    }

    fun showFavorites(weather:Manager,weatherCode:WeatherCodes, ) {
        val sortedFavorites = favorites.sorted()
        for (index in favorites.indices) {
            val location = favorites[index]
            if (location != null) {

                //val newWeather = weather.getCurrentWeather(location)

                print(" ${location}")
                println(" ${weatherCode.description}${weatherCode.icon} ")
            }
        }
    }
}

