
public class AgeValidation {
    private int age;

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
            System.out.println("Age is valid.");
        } else {
            System.out.println("Age must be 18 or above.");
        }
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        AgeValidation person = new AgeValidation();

        person.setAge(19);

        System.out.println("Age: " + person.getAge());
    }
}
