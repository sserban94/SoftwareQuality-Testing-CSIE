package DecoratorDesignPattern;

public class PizzaDecorator implements Pizzable{

    private Pizzable pizza;

    public PizzaDecorator(Pizzable pizza){
        this.pizza = pizza;
    }

    @Override
    public String getPizzaType() {
        return this.pizza.getPizzaType();
    }
}
