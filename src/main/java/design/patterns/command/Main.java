package design.patterns.command;

/**
 * 命令模式：将“请求”封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。
 * 把方法调用封装起来
 */
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        GarageDoor garageDoor = new GarageDoor();
        Command garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

        SimpleRemoteControl remote = new SimpleRemoteControl();
        remote.setCommand(lightOn); // 把命令传给调用者
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
    }
}
