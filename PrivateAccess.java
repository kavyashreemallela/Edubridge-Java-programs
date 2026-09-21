
class Student {
    private String name = "Kavya";

    public void display() {
        System.out.println("Name: " + name);
    }
}

public class PrivateAccess {
    public static void main(String[] args) {
        Student student = new Student();

        student.display();

        // student.name; 
        // This would cause an error because name is private.
    }
}
