package DecoratorDesignPattern;

public class GorgonzolaDecorator extends PizzaDecorator{

    public GorgonzolaDecorator(Pizzable pizza) {
        super(pizza);
    }

    @Override
    public String getPizzaType() {
        String pizzaType = super.getPizzaType();
        pizzaType += System.lineSeparator();
        pizzaType += "   with gorgonzola";
        return pizzaType;
    }
}
