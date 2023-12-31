package p2;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Instructor Instructor1=new Instructor(12,"Rayen","Chemlali");
        Instructor Instructor2=new Instructor(13,"Adem","Idouni");
        Instructor Instructor3=new Instructor(14,"Ahmed","khalil");
        Course Course1=new Course(1,"java",Instructor1);
        Course Course2=new Course(2,"python",Instructor2);
        Course Course3=new Course(3,"POO",Instructor3);
        ArrayList<Course> Array=new ArrayList<>();
        Array.add(Course1);
        Array.add(Course2);
        Student student=new Student(111,"Amine","Besbes",Array);
        student.enroll_courses(Course3);
        Course1.content();
        Instructor3.content();
        student.content();

    }
}