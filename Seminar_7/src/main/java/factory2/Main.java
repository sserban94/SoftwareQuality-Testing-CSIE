package factory2;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop(new MagicFactory());
        shop.createFamilyObjects();
    }
}
