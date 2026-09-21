
class Student {
    public String name = "Kavya";

    public void display() {
        System.out.println("Name: " + name);
    }
}

public class PublicAccess {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println(student.name);
        student.display();
    }
}
