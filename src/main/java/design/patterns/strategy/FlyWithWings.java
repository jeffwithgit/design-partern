package design.patterns.strategy;

/**
 * Created by xiayan on 18-6-28.
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
