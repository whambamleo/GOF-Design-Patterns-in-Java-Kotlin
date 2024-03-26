package Observer;

import java.io.File;

public class SaveNotificationListener implements  EventListener {
    public SaveNotificationListener() {}
    @Override
    public void update(String eventType, File file) {
        System.out.println("Event Manager reported an " +  eventType + " operation with the following file: " + file.getName());
    }
}
