import java.util.ArrayList;

/**
 * Created by User on 05.04.2018.
 */
public interface PublisherInterface {
    ArrayList<PublisherActionListener> getListeners();
    void addListener(PublisherActionListener listener);
    void removeListener(PublisherActionListener listener);
    void removeAllListeners();
    void notifySubscribers(String message);
}
