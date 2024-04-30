package Strategy

class PayPalPayStrategy : PayStrategy {
    override fun pay(amount: Int): Boolean {
        println("Logged in to PayPal!")
        println("Paying $amount using PayPal.")
        return true
    }
}
