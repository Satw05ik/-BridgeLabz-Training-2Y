class Course {
    // Instance variables
    private String courseName;
    private int duration; // in months
    private double fee;

    // Class variable (shared by all objects)
    private static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
        System.out.println("-------------------------");
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
        System.out.println("Institute name updated to: " + instituteName);
    }
}

// Driver class
public class OnlineCourseManagement {
    public static void main(String[] args) {
        // Create course objects
        Course c1 = new Course("Java Programming", 3, 5000);
        Course c2 = new Course("Data Science", 6, 12000);

        // Display course details before updating institute
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update institute name
        Course.updateInstituteName("GLA University");

        // Display course details after update
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
