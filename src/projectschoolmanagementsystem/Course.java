package projectschoolmanagementsystem;
import java.io.Serializable;

public abstract class Course {
    private static final long SerialVersionUID = 1L;
    private String courseID;
    private String courseName;

    public Course(String courseID, String courseName) {
        this.courseID = courseID;
        this.courseName = courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public abstract void conductExam();
}
