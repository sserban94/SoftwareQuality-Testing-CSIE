package ObservatorDesignPattern;

public class Youtube {

    public static void main(String[] args) {

        Channel matrix = new Channel();
        matrix.setChannelName("Matrix");

        Subscriber subscriber1 = new Subscriber("Neo");
        Subscriber subscriber2 = new Subscriber("Morpheus");
        Subscriber subscriber3 = new Subscriber("Trinity");
        Subscriber subscriber4 = new Subscriber("Cypher");
        Subscriber subscriber5 = new Subscriber("Switch");
        Subscriber subscriber6 = new Subscriber("Apoc");

        matrix.subscribe(subscriber1);
        matrix.subscribe(subscriber2);
        matrix.subscribe(subscriber3);
        matrix.subscribe(subscriber4);
        matrix.subscribe(subscriber5);
        matrix.subscribe(subscriber6);

        matrix.unsubscribe(subscriber4);

        subscriber1.subscribeChannel(matrix);
        subscriber2.subscribeChannel(matrix);
        subscriber3.subscribeChannel(matrix);
        subscriber4.subscribeChannel(matrix);
        subscriber5.subscribeChannel(matrix);
        subscriber6.subscribeChannel(matrix);

        matrix.upload("How to tell if you're dreaming?");

    }
}
