package design.patterns.strategy;

/**
 * Created by xiayan on 18-6-28.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quark();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
