package design.patterns.strategy;

/**
 * Created by xiayan on 18-6-28.
 */
public class Squark implements QuackBehavior {
    @Override
    public void quark() {
        System.out.println("Squark");
    }
}
