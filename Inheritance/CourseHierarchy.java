class course{
    String courseName;
    int duration;

    course(String courseName, int duration){
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayInfo(){
        System.out.println("Course Name: "+courseName);
        System.out.println("Course Duration: "+duration +"weeks");
    }
}

class OnlineCourse extends course{
    String platform;
    boolean isRecorded;
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Platform: "+platform);
        System.out.println("Recorded on: "+(isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: $" + (fee - (fee * discount / 100)));
    }
}

public class CourseHierarchy {
    public static void main(String[] args) {
        course c1 = new course("Mathematics Basics", 6);
        OnlineCourse c2 = new OnlineCourse("Java Programming", 8, "Udemy", true);
        PaidOnlineCourse c3 = new PaidOnlineCourse("Data Science Bootcamp", 12, "Coursera", true, 500.0, 20.0);

        System.out.println("--- Course ---");
        c1.displayInfo();
        System.out.println("\n--- Online Course ---");
        c2.displayInfo();
        System.out.println("\n--- Paid Online Course ---");
        c3.displayInfo();
    }
}
