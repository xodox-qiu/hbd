package diddy.example.happybirthday

/* Notifikasi Seluler
fun main() {
    val morningNotification = 12
    val eveningNotification = 200

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numMessages: Int) {
    // Fill in the code.
    if (numMessages > 99) {
        println("Your Phone is blowing up! You have 99+ notifications.")
    } else {
        println("You have $numMessages notifications." )
    }
}*/

/* Harga Tiket
fun main() {
    val child = 12
    val adult = 30
    val senior = 100

    val mon = false

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, mon)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, mon)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, mon)}.")
}

fun ticketPrice(age: Int, mon: Boolean): Int {
    return when {
        age in 0..12 -> 15
        age in 13..60 -> if (mon) 25 else 30
        age in 61..100 -> 20
        else -> -1
    }
}*/

/* Konversi Suhu
fun main() {
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { celsius ->
        (celsius * 9/5) + 32
    }
    printFinalTemperature(350.0, "Kelvin", "Celsius") { kelvin ->
        kelvin - 273.15
    }
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { fahrenheit ->
        (fahrenheit - 32) * 5/9 + 273.15
    }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // dua angka di belakang koma
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}*/







