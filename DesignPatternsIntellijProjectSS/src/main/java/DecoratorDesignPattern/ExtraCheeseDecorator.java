package DecoratorDesignPattern;

public class ExtraCheeseDecorator extends PizzaDecorator{

    public ExtraCheeseDecorator(Pizzable pizza) {
        super(pizza);
    }

    @Override
    public String getPizzaType() {
        String pizzaType = super.getPizzaType();
        pizzaType += System.lineSeparator();
        pizzaType += "   with extra cheese";
        return pizzaType;
    }
}
