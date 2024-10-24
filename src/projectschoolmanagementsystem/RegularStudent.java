package projectschoolmanagementsystem;

/**
 * Makint this class serializable so to allow objects to be written to and read from files
 * * 
 * @author User
 */
import java.io.Serializable;
//import.io.File;
//import.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class RegularStudent extends Person implements Serializable {
    private static final long SerialVersionUID = 1L; // serialization practice
    private int studentID;
    private List<Course> courses;

    public RegularStudent(String name, int age, Address address, int studentID) {
        super(name, age, address);
        this.studentID = studentID;
        this.courses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        if (course != null) {
            courses.add(course);
            System.out.println(getName() + " has enrolled in course: " + course.getCourseName());
        }
    }

    public void viewGrades() {
        System.out.println(getName() + " is viewing grades.");
    }

    public int getStudentID() {
        return studentID;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
