
class Parent {
    protected int number = 100;
}

public class ProtectedAccess extends Parent {

    void display() {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        ProtectedAccess obj = new ProtectedAccess();

        obj.display();
    }
}
