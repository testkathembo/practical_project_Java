package projectschoolmanagementsystem;

import java.io.Serializable;

/**
 * The {@code OnCampus} class represents a type of course that is conducted on a physical campus.
 * It extends the {@code Course} class and includes additional information about the location where the course is held.
 * This class provides methods for conducting exams and managing the course location.
 * 
 * <p>Example usage:
 * <pre>
 *     OnCampus course = new OnCampus("CS101", "Introduction to Computer Science", "Room 101");
 *     course.conductExam(); // Conducts the exam at the specified location
 * </pre>
 * </p>
 * 
 * @author Dieudonne
 * @version 1.0
 */
public class OnCampus extends Course implements Serializable {
    private static final long SerialVersionUID = 1L;

    /** The location where the on-campus course is held (e.g., Room 101, Main Building) */
    private String location;

    /**
     * Constructs an {@code OnCampus} course object with the specified course ID, course name, and location.
     * 
     * @param courseID the unique identifier for the course
     * @param courseName the name of the course
     * @param location the physical location where the course is held
     */
    public OnCampus(String courseID, String courseName, String location) {
        super(courseID, courseName);
        this.location = location;
    }

    /**
     * Conducts an on-campus exam. This method prints out the exam details, including the location.
     */
    @Override
    public void conductExam() {
        System.out.println("Conducting on-campus exam at location: " + location);
    }

    /**
     * Returns the location of the on-campus course.
     * 
     * @return the location of the course
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the location of the on-campus course.
     * 
     * @param location the new location of the course
     */
    public void setLocation(String location) {
        this.location = location;
    }
}
