import java.util.List;
import java.util.ArrayList;

public class Student extends People{
    private int studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, int studentID) {
        super(name, age, address);
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    public int getStudentsID() {
        return studentID;
    }

    public void getDetails() {
        super.getDetails();
        System.out.println("ID : " + studentID);
        System.out.println("");
    }
    
    public void enrollInCourse(Course course) {
        coursesEnrolled.add(course);
    }
    
    public void viewEnrolledCourses() {
        System.out.println("Matakuliah yang diambil oleh " + getName() + ":");
        for (Course c : coursesEnrolled) {
            c.getDetails();
        }
    }
}
