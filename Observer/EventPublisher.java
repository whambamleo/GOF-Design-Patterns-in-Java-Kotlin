package Observer;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EventPublisher {
    public EventManager eventManager;
    private File file;

    public EventPublisher() {
        List<String> eventTypes = Arrays.asList("open", "save");
        this.eventManager = new EventManager(eventTypes);
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        eventManager.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            eventManager.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}
