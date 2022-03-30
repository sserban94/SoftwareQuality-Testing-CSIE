package DecoratorDesignPattern;

public class JalapenoDecorator extends PizzaDecorator{

    public JalapenoDecorator(Pizzable pizza) {
        super(pizza);
    }

    @Override
    public String getPizzaType() {
        String pizzaType = super.getPizzaType();
        pizzaType += System.lineSeparator();
        pizzaType += "   with jalapenos";
        return pizzaType;
    }
}
