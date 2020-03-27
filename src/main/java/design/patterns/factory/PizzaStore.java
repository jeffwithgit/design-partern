package design.patterns.factory;

public class PizzaStore {
    public static Pizza orderPizza(String type){
        Pizza pizza = SimplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
