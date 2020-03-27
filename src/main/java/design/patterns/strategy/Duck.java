package design.patterns.strategy;

/**
 * Created by xiayan on 18-6-28.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public Duck() {
    }

    public abstract void display();

    // 委托给行为类
    public void performFly() {
        flyBehavior.fly();
    }

    // 委托给行为类
    public void performQuark() {
        quackBehavior.quark();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!!");
    }
}
