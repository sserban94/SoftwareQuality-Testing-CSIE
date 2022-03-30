package DecoratorDesignPattern;

public class ProsciuttoCrudoDecorator extends PizzaDecorator {

    public ProsciuttoCrudoDecorator(Pizzable pizza) {
        super(pizza);
    }

    @Override
    public String getPizzaType() {
        String pizzaType = super.getPizzaType();
        pizzaType += System.lineSeparator();
        pizzaType += "   with prosciutto crudo";
        return pizzaType;
    }
}
