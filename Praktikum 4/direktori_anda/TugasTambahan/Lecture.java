import java.util.List;
import java.util.ArrayList;

public class Lecture extends People {
    private int employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, int employeeID) {
        super(name, age, address);
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public int getEmployeeID() {
        return employeeID;
    }    

    public void getDetails() {
        super.getDetails();
        System.out.println("ID : " + employeeID);
        System.out.println("");
    }    

    public void teachCourse(Course course) {
        coursesTaught.add(course);
    }

    public void viewTaughtCourses() {
        System.out.println("Matakuliah yang diampu oleh : " + getName() + ":");
        for (Course course : coursesTaught) {
            course.getDetails();
        }
    }
}
