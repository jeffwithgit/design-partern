package design.patterns.factory;

/**
 * 工厂模式：定义了一个封装对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。
 * 注意与静态工厂方法的区别：静态工厂方法更多的是一种编程习惯，而工厂模式是将类的实例化延后，是一种封装变化的思路
 */
public class Main {
    public static void main(String[] args) {
        PizzaStore.orderPizza("veggie");
    }
}
