
public class ConstructorOverloading {
    String name;
    int age;

    ConstructorOverloading() {
        name = "Unknown";
        age = 0;
    }

    ConstructorOverloading(String name) {
        this.name = name;
        age = 18;
    }

    ConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        ConstructorOverloading s1 = new ConstructorOverloading();
        ConstructorOverloading s2 = new ConstructorOverloading("Kavya");
        ConstructorOverloading s3 = new ConstructorOverloading("Anu", 20);

        s1.display();
        System.out.println();

        s2.display();
        System.out.println();

        s3.display();
    }
}
