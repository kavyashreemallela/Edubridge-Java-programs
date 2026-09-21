
public class GetterSetter {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        GetterSetter student = new GetterSetter();

        student.setName("Kavya");
        student.setAge(19);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
