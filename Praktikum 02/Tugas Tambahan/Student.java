import java.util.List;
import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String address;
    private int studentID;
    private List<Course> coursesEnrolled;

    public Student(String name, int age, String address, int studentID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getStudentsID() {
        return studentID;
    }

    public void getDetails() {
        System.out.println("Nama : " + name);
        System.out.println("Umur : " + age);
        System.out.println("Alamat : " + address);
        System.out.println("ID : " + studentID);
        System.out.println("");
    }
    
    public void enrollInCourse(Course course) {
        coursesEnrolled.add(course);
    }
    
    public void viewEnrolledCourses() {
        System.out.println("Mata Kuliah yang diambil oleh " + name + ":");
        for (Course c : coursesEnrolled) {
            c.getDetails();
        }
    }
}
