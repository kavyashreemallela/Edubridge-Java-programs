
class Time {
    int seconds;
    int minutes;
    int hours;

    // Constructor with seconds
    Time(int seconds) {
        this.seconds = seconds;
        this.minutes = seconds / 60;
        this.hours = seconds / 3600;
    }

    // Constructor with minutes and seconds
    Time(int minutes, int seconds) {
        this.minutes = minutes;
        this.seconds = seconds;
        this.hours = minutes / 60;
    }

    // Constructor with hours, minutes and seconds
    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    void display() {
        System.out.println("Time: " + hours + " hours, "
                + minutes + " minutes, " + seconds + " seconds");
    }
}

public class TimeConstructorOverloading {
    public static void main(String[] args) {

        Time t1 = new Time(500);
        Time t2 = new Time(10, 30);
        Time t3 = new Time(2, 15, 20);

        t1.display();
        t2.display();
        t3.display();
    }
}