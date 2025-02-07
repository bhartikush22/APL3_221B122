
public class RedHeadDuck extends Duck implements Flyable, Quackable {
    @Override
    public void fly() {
        System.out.println("Red Head Duck flies high.");
    }

    @Override
    public void quack() {
        System.out.println("Red Head Duck quacks loudly.");
    }
}
