package Strategy

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val productPrices = mapOf(1 to 100, 2 to 50, 3 to 75, 4 to 25)
    val order = Order()
    val br = BufferedReader(InputStreamReader(System.`in`))
    var strategy: PayStrategy

    while(!order.isClosed()) {
        var continueChoice: String

        // Get order from customer
        do {
            println("Please, select a product:" + "\n" +
                    "1 - Mother board" + "\n" +
                    "2 - CPU" + "\n" +
                    "3 - HDD" + "\n" +
                    "4 - Memory" + "\n")

            val choice = Integer.parseInt(br.readLine())
            val cost = productPrices[choice]

            println("Count: ")
            val count = Integer.parseInt(br.readLine())
            if (cost != null) {
                order.incrementTotalCost(cost*count)
            }

            println("Do you wish to continue selecting products? Y/N: ")
            continueChoice = br.readLine()
        } while (continueChoice.equals("Y", ignoreCase = true))

        // Get user-supplied payment choice to determine strategy
        println("Please, select a payment method: ")
        println("1 - PayPal")
        println("2 - Credit Card")

        val paymentMethod = br.readLine()
        strategy = when(paymentMethod) {
            "1" -> { PayPalPayStrategy() }
            "2" -> { CCPayStrategy() }
            else -> { CCPayStrategy() } // default is credit card
        }

        order.processOrder(strategy, order.getTotalCost())
        println("Payment has been successful.")

        order.close()
    }

}



