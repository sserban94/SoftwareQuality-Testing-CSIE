package DecoratorDesignPattern;

public class Pizza implements Pizzable{

    @Override
    public String getPizzaType() {
        return "This is a basic pizza";
    }
}
