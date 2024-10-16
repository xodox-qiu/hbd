package diddy.example.happybirthday

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
}
