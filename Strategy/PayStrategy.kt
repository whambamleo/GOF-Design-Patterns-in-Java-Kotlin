package Strategy

interface PayStrategy {
    fun pay(amount: Int): Boolean
}