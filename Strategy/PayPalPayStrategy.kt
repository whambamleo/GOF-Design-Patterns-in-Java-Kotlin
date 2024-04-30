package Strategy

class PayPalPayStrategy : PayStrategy {
    override fun pay(amount: Int): Boolean {
        println("Paying" + amount + "using PayPal.")
        return true
    }

    override fun collectPaymentDetails() {
        println("Logged in to PayPal!")
    }

}
