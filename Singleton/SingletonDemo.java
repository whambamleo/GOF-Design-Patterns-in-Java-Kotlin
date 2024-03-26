package Singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        SingletonKT firstInstance = SingletonKT.getInstance("foo");
        SingletonKT secondInstance = SingletonKT.getInstance("bar");

        System.out.println("If you see the same value, then singleton was reused (yay!)");
        System.out.println("First instance thinks global variable is: " + firstInstance.getValue());
        System.out.println("Second instance thinks global variable is: " + secondInstance.getValue());

        if (firstInstance == secondInstance) {
            System.out.println("SUCCESS: Singleton is working!");
        } else {
            System.out.println("ERROR: Singleton failed!");
        }
    }
}
