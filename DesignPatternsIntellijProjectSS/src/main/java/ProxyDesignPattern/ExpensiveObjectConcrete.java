package ProxyDesignPattern;

public class ExpensiveObjectConcrete  implements ExpensiveObject{

    public ExpensiveObjectConcrete() {
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
        System.out.println("Processing complete");
    }

    // PRIVATE
    private void heavyInitialConfiguration() {
        System.out.println("Loading initial configuration....");
    }
}
