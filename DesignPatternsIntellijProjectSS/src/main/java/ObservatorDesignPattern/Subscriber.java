package ObservatorDesignPattern;

public class Subscriber {
    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(){
        StringBuilder builder = new StringBuilder();
        builder.append("Hello, ");
        builder.append(this.name);
        builder.append("!  ");
        builder.append(this.channel.getChannelName());
        builder.append(" just uploaded a new video which might be of interest to you: ");
        builder.append(this.channel.getVideoTitle());
        System.out.println(builder.toString());
    }

    public void subscribeChannel(Channel channel){
        this.channel = channel;
    }
}
