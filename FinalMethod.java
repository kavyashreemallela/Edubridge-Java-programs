
class Parent {

    final void display() {
        System.out.println("This is a final method.");
    }
}

public class FinalMethod extends Parent {

    public static void main(String[] args) {
        FinalMethod obj = new FinalMethod();

        obj.display();
    }
}
