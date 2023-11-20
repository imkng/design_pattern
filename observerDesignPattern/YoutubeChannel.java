package observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{
    List<Observer> subscriberList = new ArrayList<>();

    @Override
    public void subscribe(Observer ob) {
        this.subscriberList.add(ob);
    }

    @Override
    public void unsubscribe(Observer ob) {
        this.subscriberList.remove(ob);
    }

    @Override
    public void notifyChanges(String title) {
        for (Observer observer: this.subscriberList) {
            observer.notified(title);
        }
    }
}
