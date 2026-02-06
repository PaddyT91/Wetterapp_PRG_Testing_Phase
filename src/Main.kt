import javafx.application.Application
import java.io.File

/*
  Projekt:      Wetterapp
  Firma:        ABB Technikerschule
  Autor:        Tobias Graf

  Beschreibung: Main
*/


fun main(){
    Application.launch(Gui::class.java)

    val file = File("test.txt")
    file.canExecute()

//    val myApiHandler = ApiHandler()
//    val myTest = Manager(myApiHandler)
//    myTest.fetchLocations("Wil")
//    val loc = myTest.pickLocation("Wil", 1)
//    val test = myTest.getCurrentWeather(loc)
//    println("$test")

}