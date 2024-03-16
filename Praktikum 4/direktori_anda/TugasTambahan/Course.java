import java.util.List;
import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    public Course(String courseCode, String courseName, Lecture lecture) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentsEnrolled.add(student);
    }

    public String getLecturerName() {
        return lecture.getName();
    }

    public void removeStudent(Student student) {
        studentsEnrolled.remove(student);
    }

    public void viewEnrolledStudents() {
        System.out.println("Mahasiswa yang mengambil " + courseName + ":");
        for (Student s : studentsEnrolled) {
            s.getDetails();
        }
    }

    public void getDetails() {
        System.out.println("ID : " + courseCode);
        System.out.println("Nama : " + courseName);
        System.out.println("Dosen pengampu : " + getLecturerName());
        System.out.println("");
    }      
}

