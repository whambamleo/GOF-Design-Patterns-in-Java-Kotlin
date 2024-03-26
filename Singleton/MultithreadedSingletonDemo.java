package Singleton;

public class MultithreadedSingletonDemo {

    static class FooThread implements Runnable {
        @Override
        public void run() {
            MultithreadSafeSingleton singleton = MultithreadSafeSingleton.getInstance("foo");
            System.out.println("First instance thinks global variable is: " + singleton.value);
        }
    }

    static class BarThread implements Runnable {
        @Override
        public void run() {
            MultithreadSafeSingleton singleton = MultithreadSafeSingleton.getInstance("bar");
            System.out.println("Second instance thinks global variable is: " + singleton.value);
        }
    }

    public static void main(String[] args) {
        // Non-thread safe Singleton implementation
        Thread fooThread = new Thread(new FooThread());
        Thread barThread = new Thread(new BarThread());
        System.out.println("If you see the same value, then singleton was reused (yay!)");
        fooThread.start();
        barThread.start();
    }
}
