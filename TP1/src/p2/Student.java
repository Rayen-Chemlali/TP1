package p2;
import java.util.ArrayList;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private  ArrayList<Course> courses;

    public Student(int studentId, String firstName, String lastName,ArrayList<Course> courses) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = courses;}
    public int getStudentId() {
        return studentId;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public ArrayList<Course> getCourses()
    {
        return courses;
    }
    public void enroll_courses(Course Course)
    {
        courses.add(Course);
    }
    public void content()
    {
        System.out.println("This is "+firstName+" "+lastName+"\n"+"ID:"+studentId);
        System.out.print(firstName+" Courses : ");
        for (Course element : courses) {
            System.out.print(element.getCourseName()+"  ");
        }
    }

}
