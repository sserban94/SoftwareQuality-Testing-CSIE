package ObservatorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String channelName;
    private String videoTitle;



    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(){
        for (Subscriber subscriber : subscribers){
            subscriber.update();
        }
    }

    public void upload(String title) {
        this.videoTitle = title;
        notifySubscribers();
    }

    public String getVideoTitle() {
        return videoTitle;
    }


    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
}
