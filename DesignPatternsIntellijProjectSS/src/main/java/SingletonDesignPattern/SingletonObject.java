package SingletonDesignPattern;

public class SingletonObject {

    // notice this is static
    private static SingletonObject instance;

    // the default ctor is private
    private SingletonObject(){};

    public static SingletonObject getInstance() {
        // if the singleton object is not yet initialized
        if (instance == null){
            synchronized (SingletonObject.class) {
                if (instance == null){  // in case multiple threads enter the synchronized block at the same time
                    instance = new SingletonObject();  // create a new one
                }
            }
        }
        return instance;    // return the instance
    }

    public void displayMsg() {
        System.out.println("Hello! I'm the one and only");
    }

}
