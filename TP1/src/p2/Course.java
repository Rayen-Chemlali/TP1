package p2;

public class Course {
    private int courseId;
    private String courseName;
    private Instructor instructor;

    public Course(int courseId, String courseName, Instructor instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }
    public void content()
    {
        System.out.println("This is "+courseName+" course\n"+"ID:"+courseId+"\n"+"Given by "+instructor.getFirstName()+" "+instructor.getLastName());
    }
}