package projectschoolmanagementsystem;
import java.io.Serializable;

/**
 * Represents an abstract course in the school management system.
 * Implements {@link Serializable} to allow instances of this class and its subclasses to be serialized for file storage.
 * 
 * The class contains attributes for a unique course identifier and the course name.
 * It provides getter methods for both attributes, and an abstract method {@code conductExam()} that must be implemented by subclasses.
 * This class is meant to be extended by specific types of courses such as on-campus or online courses.
 * 
 * @author Dieudonne
 */
public abstract class Course implements Serializable {

    private static final long serialVersionUID = 1L; // Unique identifier for serialization

    private String courseID;   // Unique identifier for the course
    private String courseName; // Name of the course

    /**
     * Constructs a Course object with the specified ID and name.
     * This constructor is intended to be used by subclasses to initialize common course attributes.
     * 
     * @param courseID The unique identifier for the course.
     * @param courseName The name of the course.
     */
    public Course(String courseID, String courseName) {
        this.courseID = courseID;
        this.courseName = courseName;
    }

    /**
     * Gets the unique identifier of the course.
     * 
     * @return The course ID as a String.
     */
    public String getCourseID() {
        return courseID;
    }

    /**
     * Gets the name of the course.
     * 
     * @return The course name as a String.
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * Abstract method that represents the process of conducting an exam for the course.
     * This method must be implemented by any subclass of {@code Course} (e.g., OnCampus or Online).
     */
    public abstract void conductExam();
}
