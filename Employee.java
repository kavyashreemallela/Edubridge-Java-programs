
public class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Kavya", 30000);
        Employee e2 = new Employee("Anu", 35000);

        e1.display();
        System.out.println();

        e2.display();
    }
}
