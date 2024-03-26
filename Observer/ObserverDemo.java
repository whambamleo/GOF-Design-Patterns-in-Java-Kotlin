package Observer;

public class ObserverDemo {
    public static void main(String[] args) {
        EventPublisher eventPub = new EventPublisher();

        // Randomized list of listeners
        for (int i = 0; i<10; i++) {
            if (Math.random() > 0.5) {
                eventPub.eventManager.subscribe("open", new OpenNotificationListener());
            } else {
                eventPub.eventManager.subscribe("save", new SaveNotificationListener());
            }
        }

        try {
            eventPub.openFile("test.txt");
            eventPub.saveFile();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
