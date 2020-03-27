package design.patterns.strategy;

/**
 * Created by xiayan on 18-6-28.
 */
public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm fly with rocket!!!");
    }
}
