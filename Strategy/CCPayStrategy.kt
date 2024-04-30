package Strategy

class CCPayStrategy : PayStrategy {
    override fun pay(amount: Int): Boolean {
        println("Paying " + amount + " using credit card.")
        return true
    }

    override fun collectPaymentDetails() {
        println("Logged in to bank account!")
    }
}
