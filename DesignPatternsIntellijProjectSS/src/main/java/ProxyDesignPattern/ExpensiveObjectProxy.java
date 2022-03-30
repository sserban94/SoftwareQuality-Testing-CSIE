package ProxyDesignPattern;

public class ExpensiveObjectProxy implements ExpensiveObject{

    private static ExpensiveObject expensiveObject;

    @Override
    public void process() {
        if (expensiveObject == null){
            expensiveObject = new ExpensiveObjectConcrete();
        }
        expensiveObject.process();
    }


    // We can call some extra methods in proxy

    private void doStuffBeforeProcessing(){
        System.out.println("Doing some preprocessing operations");
    }

    private void doStuffAfterProcessing(){
        System.out.println("Doing some postprocessing operations");
    }
}
