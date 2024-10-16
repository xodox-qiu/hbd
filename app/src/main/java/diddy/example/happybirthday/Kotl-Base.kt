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

/* Popular Song
class PopSong(
    val title: String,
    val artist: String,
    val year: Int,
    var playCount: Int
) {
    val isPopular: Boolean
        get() = playCount >= 1000
    fun printDescription() {
        println("$title, dibawakan oleh $artist, dirilis pada tahun $year.")
    }
}
fun main() {
    val song = PopSong("Cancer", "My Chemical Romance", 2007, 237_000_000)
    song.printDescription()
    println("${song.title} popular? ${song.isPopular}")
}*/

/* Internet Profile
fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        println("Likes to $hobby.")
        if(referrer != null) {
            print("Has a referrer named ${referrer.name}")
        	if(referrer.hobby != null) {
                print(", who likes to ${referrer.hobby}.")
            } else {
                print(".")
            }
        } else {
            print("Doesn't have a referrer.\n\n")
        }
    }
}*/

/* Foldable Phone
open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }
    fun switchOff() {
        isScreenLightOn = false
    }
    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded: Boolean = true): Phone() {
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }
    fun fold() {
        isFolded = true
    }
    fun unfold() {
        isFolded = false
    }
}
fun main() {
    val newFoldablePhone = FoldablePhone()
    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
    newFoldablePhone.unfold()
    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
}*/

/* Lelang
fun main() {
    val winningBid = Bid(5000, "Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    return bid?.amount ?: minimumPrice
}*/





