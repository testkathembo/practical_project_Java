package projectschoolmanagementsystem;

import java.io.Serializable;

/**
 * The {@code Online} class represents a type of course that is conducted online via a virtual platform.
 * It extends the {@code Course} class and includes additional information about the platform used for online instruction.
 * This class provides methods for conducting exams and managing the course platform.
 *
 * <p>Example usage:
 * <pre>
 *     Online course = new Online("CS102", "Data Structures", "Zoom");
 *     course.conductExam(); // Conducts the exam on the specified platform
 * </pre>
 * </p>
 * 
 * @author Dieudonne
 * @version 1.0
 */
public class Online extends Course implements Serializable {
    private static final long SerialVersionUID = 1L;

    /** The platform used for the online course (e.g., Zoom, Moodle, Teams) */
    private String platform;

    /**
     * Constructs an {@code Online} course object with the specified course ID, course name, and platform.
     * 
     * @param courseID the unique identifier for the course
     * @param courseName the name of the course
     * @param platform the platform used for conducting the online course
     */
    public Online(String courseID, String courseName, String platform) {
        super(courseID, courseName);
        this.platform = platform;
    }

    /**
     * Conducts an online exam. This method prints out the exam details, including the platform where the exam will take place.
     */
    @Override
    public void conductExam() {
        System.out.println("Conducting online exam on platform: " + platform);
    }

    /**
     * Returns the platform used for the online course.
     * 
     * @return the platform for the online course
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * Sets the platform for the online course.
     * 
     * @param platform the new platform to be used for the course
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
