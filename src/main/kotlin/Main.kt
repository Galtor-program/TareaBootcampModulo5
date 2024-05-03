fun main() {
    // valores para la funcion printNotificationsSummary
    val morningNotification = 51
    val eveningNotification = 135
    // llamamos a la funcion printNotificationsSummary
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)

    // Ejercicio 2 Entradas al cine
    val child = 5
    val adult = 28
    val senior = 87
    val isMonday = true
    // llamamos a la funcion ticketPrice enviando los parametros de edad y si es lunes
    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")

    //Ejercicio 3 medidas de temperatura
    val celsius = 27.0
    val kelvin = 350.0
    val farenheit =  10.0
    printFinalTemperature(celsius,"celsius", "farenheit", { celsiusAFarenheit(celsius) } )
    printFinalTemperature(kelvin,"kelvin", "farenheit", { kelvinACelsius(kelvin) } )
    printFinalTemperature(celsius,"celsius", "farenheit", { farenheitAKelvin(farenheit) } )

    /**
     * instanciamos la clase Song y pedimos sus los datos.
     */
    val song = Song()
    println(" ${song.titulo} interpretada por ${song.artista}, se lanzó en el año ${song.añoLanzamiento}")
    println(song.popular())





}



/** Esta funcion recibe como parametros la cantidad de mensajes, y segun
 * estos enviara uno u otro mensaje.
 */
fun printNotificationSummary(numberOfMessages: Int) {
     if (numberOfMessages <= 99) {
        println("You have $numberOfMessages notifications")
    }else{
        println("Your phone is blowing up! you have +99 notifications")
    }
}

/** Para este ejercicio la funcion recibe un entero con la edad
 * y un booleano para saber si es lunes, generamos los if
 * pero tambien se puede realizar con la sentencia when
 * tambien uso un ejemplo usando in range de 13.. 60 años
 */
fun ticketPrice (age: Int, isMonday:Boolean): Int{
    var valor : Int = 0
    if (age <= 12 ) {
       valor =  15
    }
    if (age > 60){
        valor = 20
    }
    if (age in 13..60) {
        valor = if (isMonday) {
            25
        } else {
            30
        }
    }
    return valor
}


/** Funcion de las temperaturas que recibe un doble con la temperatura inicial
 * luego 2 string con los tipos de conversion y una funcion para realizar la conversion
 *
 */
fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
fun celsiusAFarenheit(celcius:Double): Double{
     var formula1 = (9.0/ 5.0)
     return formula1 * celcius+ 32
}

fun kelvinACelsius (kelvin:Double):Double{
    var formula2 = kelvin - 273.15
    return formula2

}
fun farenheitAKelvin (farenheit:Double):Double{
    var formula3 = (5.0 / 9.0)
    return formula3 * farenheit - 32 + 273.15
}


//ejercicio 4 Creamos la clase song
/**
 * Creamos los propiedades de la cancion
 */
class Song(
    val titulo: String = "Suave",
    val artista: String = "Luis Miguel",
    val añoLanzamiento:Int = 1992,
    val reproducciones:Int = 1200

)

{

    /**
     * Funcion para saber si la cancion cumple para ser popular
     */
    fun popular(){
        if (reproducciones > 100){
            println("La cancion es popular")
        }else {
            println("La canción no es popular")
    }
}
}
