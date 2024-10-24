package projectschoolmanagementsystem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The {@code RegularStudent} class represents a regular student in the school management system. 
 * It extends the {@link Person} class and implements {@link Serializable} to allow objects of this class 
 * to be written to and read from files.
 * 
 * <p>Regular students have a unique student ID and a list of courses they are enrolled in. 
 * They can enroll in courses, view grades, and have their data serialized for persistence.</p>
 * 
 * <p>Example usage:
 * <pre>
 *     RegularStudent student = new RegularStudent("Alice Johnson", 20, new Address("123 Main St", "Springfield", "USA", "555-1234", "alice@example.com"), 101);
 *     student.enrollInCourse(new Course("CS101", "Introduction to Computer Science"));
 * </pre>
 * </p>
 * 
 * @author User
 * @version 1.0
 */
public class RegularStudent extends Person implements Serializable {
    private static final long SerialVersionUID = 1L; // serialization practice
    
    private int studentID; // Unique student ID
    private List<Course> courses; // List of courses the student is enrolled in

    /**
     * Constructs a {@code RegularStudent} object with the specified name, age, address, and student ID.
     * This constructor calls the {@code Person} constructor to initialize the common person attributes.
     * 
     * @param name the name of the student
     * @param age the age of the student
     * @param address the address of the student, represented as an {@link Address} object
     * @param studentID the unique student ID of the student
     */
    public RegularStudent(String name, int age, Address address, int studentID) {
        super(name, age, address); // Call to Person constructor
        this.studentID = studentID; // Set the student ID
        this.courses = new ArrayList<>(); // Initialize the list of courses
    }

    /**
     * Enrolls the student in a specified course by adding the course to the list of courses.
     * 
     * @param course the course to enroll in, represented as a {@link Course} object
     */
    public void enrollInCourse(Course course) {
        if (course != null) {
            courses.add(course); // Add the course to the list
            System.out.println(getName() + " has enrolled in course: " + course.getCourseName());
        }
    }

    /**
     * Displays a message indicating that the student is viewing their grades.
     * This method does not currently implement actual grade tracking.
     */
    public void viewGrades() {
        System.out.println(getName() + " is viewing grades.");
    }

    /**
     * Returns the unique student ID of the student.
     * 
     * @return the student's ID as an integer
     */
    public int getStudentID() {
        return studentID; // Return the student ID
    }

    /**
     * Returns the list of courses the student is enrolled in.
     * 
     * @return a list of {@link Course} objects representing the student's courses
     */
    public List<Course> getCourses() {
        return courses; // Return the list of courses
    }

    /**
     * Sets the list of courses for the student.
     * This method allows replacing the existing list of courses with a new list.
     * 
     * @param courses a list of {@link Course} objects to replace the current courses
     */
    public void setCourses(List<Course> courses) {
        this.courses = courses; // Set the new list of courses
    }
}
