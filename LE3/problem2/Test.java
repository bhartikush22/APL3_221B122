
public class Test implements Testable {
    @Override
    public void display() {
        System.out.println("Test class implementing display()");
    }
    
    public static void main(String[] args) {
        Test obj = new Test();
        obj.display();
    }
}
