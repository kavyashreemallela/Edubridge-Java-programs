
public class MarksValidation {
    private int marks;

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
            System.out.println("Marks accepted.");
        } else {
            System.out.println("Invalid marks.");
        }
    }

    public int getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        MarksValidation student = new MarksValidation();

        student.setMarks(87);

        System.out.println("Marks: " + student.getMarks());
    }
}
