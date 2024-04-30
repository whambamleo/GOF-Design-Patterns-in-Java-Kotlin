package Strategy

class CCPayStrategy : PayStrategy {
    override fun pay(amount: Int): Boolean {
        println("Logged in to bank account!")
        println("Paying $amount using credit card.")
        return true
    }
}
