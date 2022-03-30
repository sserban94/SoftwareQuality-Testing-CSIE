package SingletonDesignPattern;

public class SingletonMain {

    public static void main(String[] args) {
        // nope - the default constructor is private so the user can't create a new instance
        // SingletonObject object = new SingletonObject();

        // only way to get that object
        SingletonObject singletonObj = SingletonObject.getInstance();
        singletonObj.displayMsg();

        // try to get a new one
        SingletonObject singletonSecondaryObject = SingletonObject.getInstance();

        // We always get the same reference
        boolean areTheyTheOneAndTheSame = singletonObj == singletonSecondaryObject;
        System.out.println("Are they two references pointing to the same object? " + areTheyTheOneAndTheSame);

    }
}
