package design.patterns.strategy;

/**
 * Created by xiayan on 18-6-28.
 * 第一章【策略模式】：定义了算法族，分别封装起来，让他们之间可以互相替换，
 * 此模式让算法的变化独立于使用算法的客户。
 */
public class Main {
    public static void main(String[] args) {
        // 野鸭：会飞，会Quark叫
        System.out.println("mallard duck start!");
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuark();
        System.out.println("mallard duck end!");

        // 模型鸭：不会飞
        System.out.println("model duck start!");
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuark();
        modelDuck.setFlyBehavior(new FlyWithRocket()); // 在运行时改变鸭子的行为，只需要调用鸭子的setter方法就可以
        System.out.println("=============================");
        modelDuck.performFly();
        System.out.println("mallard duck end!");

    }
}
