public class Main {
  public static void main(String[] args) {
      
      Student s1,s2, s3;
      Course matkul1,matkul2;
      Lecture dosen1, dosen2;

      s1 = new Student("Kim Gimyung", 20, "Jl Gangseo no 34", 240601211);
      s2 = new Student("Jang Hyun", 21, "Jl Gangdong no 12", 240601221);
      s3 = new Student("Ahn Hyunseong", 21, "Jl Ansan no 10", 240601223);

      dosen1 = new Lecture("Park Jinyoung", 30, "Jl Gangnam no 76", 6754);
      dosen2 = new Lecture("Choi Dongsoo", 35, "Jl Gangnam no 45", 5647);

      matkul1 = new Course("PAIK1", "Algoritma Pemrograman",dosen1);
      matkul2 = new Course("PAIK2", "Basis Data", dosen2);
      
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
