package Singleton;
// marking the class as final prevents subclassing to ensure it remains Singleton
public final class MultithreadSafeSingleton {

    /*
    static variable to hold the single instance of the class. Must be declared volatile for DCL. It prevents
    situations where one thread might see a partially constructed object or stale data.
     */
    private static volatile MultithreadSafeSingleton instance;
    // public field to hold a globally accessible, singular value
    public String value;

    private MultithreadSafeSingleton(String value) {
        this.value = value;
    }

    public static MultithreadSafeSingleton getInstance(String initialValue) {

        MultithreadSafeSingleton result = instance;
        if (result != null) {
            return result;
        }

        /*
        This is synchronization at the class level. Across all instances of the MultithreadSafeSingleton class, only
        one thread at a time can access this code
         */
        synchronized (MultithreadSafeSingleton.class) {
            if (instance == null) {
                instance = new MultithreadSafeSingleton(initialValue); // only create new instance if never initialized
                return instance;
            }
            // Notice we DON'T update the value of the existing singleton instance. This is a design choice.
            return instance;
        }
    }
}
