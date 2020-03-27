package design.patterns.factory;

public class SimplePizzaFactory {
    public static Pizza createPizza(String type){
        Pizza pizza = new Pizza();
        if("cheese".equals(type)){
            pizza = new CheesePizza();
        } else if("veggie".equals(type)){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
