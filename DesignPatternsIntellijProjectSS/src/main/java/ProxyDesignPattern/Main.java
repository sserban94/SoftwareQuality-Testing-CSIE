package ProxyDesignPattern;

public class Main {
    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        System.lineSeparator();
        object.process();
        object.process();
        object.process();
        object.process();
    }
}
