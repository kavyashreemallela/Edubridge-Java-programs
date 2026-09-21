
class Engine {

    void start() {
        System.out.println("Engine starts");
    }
}

public class CompositionDemo {

    private Engine engine;

    CompositionDemo() {
        engine = new Engine();
    }

    void startCar() {
        engine.start();
        System.out.println("Car starts moving");
    }

    public static void main(String[] args) {
        CompositionDemo car = new CompositionDemo();

        car.startCar();
    }
}
