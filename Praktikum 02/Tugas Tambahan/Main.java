public class Main {
  public static void main(String[] args) {
      
      Student s1,s2, s3;
      Course matkul1,matkul2;
      Lecture dosen1;

      s1 = new Student("Kim Gimyung", 20, "Sandy Shores", 240601211);
      s2 = new Student("Jang Hyun", 19, "Rocks Wood", 240601221);
      s3 = new Student("Ahn Hyunseong", 19, "Vinewood", 240601223);

      dosen1 = new Lecture("Choi", 30, "Alta Street", 45);
      

      matkul1 = new Course("PAIK1", "Alpro",dosen1);
      matkul2 = new Course("PAIK2", "Basis Data", dosen1);
      
      dosen1.teachCourse(matkul1);
      dosen1.teachCourse(matkul2);  

      s2.getDetails();
      s1.getDetails();

      matkul1.addStudent(s1);
      matkul2.addStudent(s2);
      matkul2.addStudent(s3);

      s1.enrollInCourse(matkul1);
      s2.enrollInCourse(matkul2);
      s3.enrollInCourse(matkul2);

      s1.viewEnrolledCourses();
      s2.viewEnrolledCourses();
      s3.viewEnrolledCourses();

      dosen1.viewTaughtCourses();
      matkul2.removeStudent(s3);
      matkul2.viewEnrolledStudents();
  }
}
