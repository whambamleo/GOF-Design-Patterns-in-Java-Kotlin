package Singleton;

public final class Singleton {              // marking the class as final prevents subclassing to ensure it remains Singleton
    private static Singleton instance;      // static variable to hold the single instance of the class
    public String value;                    // public field to hold a globally accessible, singular value

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String initialValue) {
        if (instance == null) {
            instance = new Singleton(initialValue);    // only create new instance if never initialized
            return instance;
        }
        // Notice we DON'T update the value of the existing singleton instance. This is a design choice.
        return instance;
    }
}