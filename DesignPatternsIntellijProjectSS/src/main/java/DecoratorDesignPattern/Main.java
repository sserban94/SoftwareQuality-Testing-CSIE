package DecoratorDesignPattern;

public class Main {
    public static void main(String[] args) {

        Pizzable pizza = new Pizza();
        System.out.println(pizza.getPizzaType() + System.lineSeparator());

        Pizzable extraCheeseDecorator = new ExtraCheeseDecorator(pizza);
        System.out.println(extraCheeseDecorator.getPizzaType() + System.lineSeparator());

        Pizzable jalapenoDecorator = new JalapenoDecorator(pizza);
        System.out.println(jalapenoDecorator.getPizzaType() + System.lineSeparator());

        Pizzable gorgonzolaDecorator = new GorgonzolaDecorator(pizza);
        System.out.println(gorgonzolaDecorator.getPizzaType() + System.lineSeparator());

        Pizzable prosciuttoCrudoDecorator = new ProsciuttoCrudoDecorator(pizza);
        System.out.println(prosciuttoCrudoDecorator.getPizzaType() + System.lineSeparator());

        // Ok, but what if we want to combine them?
        // Using dependency injection we can create a pizza with all these ingredients

        extraCheeseDecorator = new ExtraCheeseDecorator(pizza);
        jalapenoDecorator = new JalapenoDecorator(extraCheeseDecorator);
        gorgonzolaDecorator = new GorgonzolaDecorator(jalapenoDecorator);
        prosciuttoCrudoDecorator = new ProsciuttoCrudoDecorator(gorgonzolaDecorator);
        System.out.println(prosciuttoCrudoDecorator.getPizzaType());
    }
}
