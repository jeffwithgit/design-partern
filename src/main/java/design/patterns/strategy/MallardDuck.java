package design.patterns.strategy;

/**
 * Created by xiayan on 18-6-28.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quark();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
