
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

public class InheritanceDemo extends Animal {

    void sleep() {
        System.out.println("Animal is sleeping");
    }

    public static void main(String[] args) {
        InheritanceDemo obj = new InheritanceDemo();

        obj.eat();
        obj.sleep();
    }
}
