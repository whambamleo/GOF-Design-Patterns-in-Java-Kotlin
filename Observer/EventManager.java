package Observer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<EventListener>> eventTypeToListener = new HashMap<>();

    public EventManager(List<String> eventTypes) {
        for (String eventType: eventTypes) {
            this.eventTypeToListener.put(eventType, new ArrayList<EventListener>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        eventTypeToListener.get(eventType).add(listener);
    }

    public void notify(String eventType, File file) {
        List<EventListener> listeners = eventTypeToListener.get(eventType);
        for (EventListener listener: listeners) {
            listener.update(eventType, file);
        }
    }
}
