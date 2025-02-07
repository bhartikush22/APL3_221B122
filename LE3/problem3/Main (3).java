
public class Main {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();

        System.out.println("Rubber Duck:");
        rubberDuck.swim();
        ((Quackable) rubberDuck).quack();

        System.out.println("\nWooden Duck:");
        woodenDuck.swim();
        

        System.out.println("\nRed Head Duck:");
        redHeadDuck.swim();
        ((Flyable) redHeadDuck).fly();
        ((Quackable) redHeadDuck).quack();

        System.out.println("\nLake Duck:");
        lakeDuck.swim();
        ((Flyable) lakeDuck).fly();
        ((Quackable) lakeDuck).quack();
    }
}
