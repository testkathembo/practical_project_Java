package projectschoolmanagementsystem;
import java.io.Serializable;

/**
 * Represents an assignment given in a course.
 * Implements {@link Serializable} to allow instances of this class to be serialized for file storage.
 * 
 * The class contains a single attribute to store the assignment name and provides getter methods to access the attribute.
 * 
 * @author Dieudonne
 */
public class Assignment implements Serializable {

    private static final long serialVersionUID = 1L; // Unique identifier for serialization
    
    private String assignmentName;  // The name of the assignment

    /**
     * Constructs an Assignment object with the specified name.
     * 
     * @param assignmentName The name of the assignment.
     */
    public Assignment(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    /**
     * Gets the name of the assignment.
     * 
     * @return The assignment name as a String.
     */
    public String getAssignmentName() {
        return assignmentName;
    }
}
