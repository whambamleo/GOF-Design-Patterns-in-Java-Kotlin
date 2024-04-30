package Strategy

class Order(
    private var totalCost: Int = 0,
    private var isClosed: Boolean = false) {

    fun processOrder(strategy: PayStrategy) {
        strategy.collectPaymentDetails()
    }

    fun incrementTotalCost(amount: Int) {
        totalCost += amount
    }

    fun getTotalCost(): Int {
        return totalCost
    }

    fun isClosed(): Boolean {
        return isClosed
    }

    fun close() {
        isClosed = true
    }
}