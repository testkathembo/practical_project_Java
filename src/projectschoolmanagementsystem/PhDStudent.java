package projectschoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@code PhDStudent} class extends the {@link RegularStudent} class and implements the {@link Teacher} interface.
 * This class represents a PhD student who also teaches courses in the school management system.
 * It contains specific attributes such as the department the student teaches in and the list of courses they have taught.
 * 
 * <p>Example usage:
 * <pre>
 *     PhDStudent phdStudent = new PhDStudent("John Doe", 30, new Address("123 Main St", "Cityville", "Country", "1234567890", "email@example.com"), 12345, "Computer Science");
 *     phdStudent.teachCourse(new Course("CS101", "Intro to Programming"));
 * </pre>
 * </p>
 * 
 * @author Dieudonne
 * @version 1.0
 */
public class PhDStudent extends RegularStudent implements Teacher {
    private int studentID; // Unique student ID (camelCase convention)
    private String department; // Department where the PhD student teaches
    private List<Course> coursesTaught = new ArrayList<>(); // List of courses taught by the PhD student

    /**
     * Constructs a {@code PhDStudent} object with the specified name, age, address, student ID, and department.
     * This constructor calls the {@code RegularStudent} constructor to initialize common student attributes.
     * 
     * @param name the name of the PhD student
     * @param age the age of the PhD student
     * @param address the address of the PhD student, represented as an {@link Address} object
     * @param studentID the unique student ID of the PhD student
     * @param department the department where the PhD student teaches
     */
    public PhDStudent(String name, int age, Address address, int studentID, String department) {
        super(name, age, address, studentID); // Call to RegularStudent constructor
        this.department = department;        // Set the department
    }

    /**
     * Teaches a course by adding the course to the list of courses taught by the PhD student.
     * This method fulfills the {@link Teacher#teachCourse(Course)} requirement of the {@code Teacher} interface.
     * 
     * @param course the course to be taught, represented as a {@link Course} object
     */
    @Override
    public void teachCourse(Course course) {
        coursesTaught.add(course); // Add course to the list of courses taught
        System.out.println(getName() + " is teaching course: " + course.getCourseName());
    }

    /**
     * Grades a student on a specific assignment and prints the result to the console.
     * This method fulfills the {@link Teacher#gradeStudent(RegularStudent, Assignment, int)} requirement of the {@code Teacher} interface.
     * 
     * @param student the student being graded, represented as a {@link RegularStudent} object
     * @param assignment the assignment being graded, represented as an {@link Assignment} object
     * @param grade the grade given to the student for the assignment
     */
    @Override
    public void gradeStudent(RegularStudent student, Assignment assignment, int grade) {
        System.out.println("Graded student ID " + student.getStudentID() + 
                           " on assignment: " + assignment.getAssignmentName() + 
                           " with grade: " + grade);
    }

    /**
     * Returns the list of courses taught by the PhD student.
     * 
     * @return a list of {@link Course} objects representing the courses taught by the PhD student
     */
    @Override
    public List<Course> getCoursesTaught() {
        return coursesTaught; // Return the list of courses taught
    }

    /**
     * Returns a string representation of the PhD student, including their name, age, address, and department.
     * This method overrides the {@link RegularStudent#toString()} method to include additional PhD student details.
     * 
     * @return a string representation of the PhD student
     */
    @Override
    public String toString() {
        return super.toString() + ", Department: " + department; // Include department info
    }
}
