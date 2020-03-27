package design.patterns.strategy;

/**
 * Created by xiayan on 18-6-28.
 */
public class Quark implements QuackBehavior {
    @Override
    public void quark() {
        System.out.println("Quark");
    }
}
