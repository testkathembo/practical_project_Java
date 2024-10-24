
package projectschoolmanagementsystem;
import java.io.Serializable;

public class Classroom {
    private static final long SerialVersionUID = 1L;
    private String classroomID; // Unique identifier for the classroom
    private int capacity; // Maximum number of students the classroom can accommodate

    // Constructor
    public Classroom(String classroomID, int capacity) {
        this.classroomID = classroomID; // Use lowercase 'classroomID' for consistency
        this.capacity = capacity; // Use lowercase 'capacity' for consistency
    }

    // Getter method to access the classroom ID
    public String getClassroomID() {
        return classroomID; // Return the lowercase 'classroomID' variable
    }

    // Setter method to update the classroom ID
    public void setClassroomID(String classroomID) {
        this.classroomID = classroomID; // Use lowercase 'classroomID' for consistency
    }

    // Getter method to access the capacity of the classroom
    public int getCapacity() {
        return capacity; // Return the lowercase 'capacity' variable
    }

    // Setter method to update the capacity of the classroom
    public void setCapacity(int capacity) {
        if (capacity > 0) { // Add validation to ensure capacity is positive
            this.capacity = capacity;
        } else {
            throw new IllegalArgumentException("Capacity must be greater than zero."); // Handle invalid capacity
        }
    }
}

