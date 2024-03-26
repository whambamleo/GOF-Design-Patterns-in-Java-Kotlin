package Singleton

class SingletonKT private constructor(var value: String) {
    companion object {
        @Volatile
        private var instance: SingletonKT? = null

        @JvmStatic
        fun getInstance(initialValue: String): SingletonKT {
            return instance ?: synchronized(this) {
                // Check if instance is null again in case another thread has initialized it while waiting for the lock
                instance ?: SingletonKT(initialValue).also { instance = it }
            }
        }
    }
}
