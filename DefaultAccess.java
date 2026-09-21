
class Student {
    String name = "Kavya";

    void display() {
        System.out.println("Name: " + name);
    }
}

public class DefaultAccess {
    public static void main(String[] args) {
        Student student = new Student();

        student.display();
    }
}
