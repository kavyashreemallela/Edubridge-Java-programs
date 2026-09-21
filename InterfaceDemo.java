
interface Vehicle {
    void start();
}

public class InterfaceDemo implements Vehicle {

    @Override
    public void start() {
        System.out.println("Vehicle is starting");
    }

    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();

        obj.start();
    }
}
