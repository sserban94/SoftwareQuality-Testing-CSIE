package factory2;

public class Shop {
    IFactory factory;

    public Shop(IFactory factory) {
        this.factory = factory;
    }

    public void createFamilyObjects(){
        ICostume costume = factory.getCostume();
        // weapon here

        costume.protection();
        // weapon power here
    }
}
