package projectschoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * The {@code Staff_Teacher} class represents a staff member who also serves as a teacher.
 * It extends the {@link StaffOnly} class and implements the {@link Teacher} interface.
 * 
 * <p>In addition to having attributes such as department and position, a staff teacher can teach courses
 * and grade students on assignments.</p>
 * 
 * <p>Example usage:
 * <pre>
 *     Address address = new Address("123 Main St", "Springfield", "USA", "123-456-7890", "teacher@example.com");
 *     Staff_Teacher teacher = new Staff_Teacher("John Doe", 40, address, "Computer Science", "Lecturer");
 *     Course course = new OnCampus("CS101", "Intro to Programming", "Room 101");
 *     teacher.teachCourse(course);
 *     teacher.gradeStudent(student, assignment, 85);
 * </pre>
 * </p>
 * 
 * @author User
 * @version 1.0
 */
public class Staff_Teacher extends StaffOnly implements Teacher {
    private static final long SerialVersionUID = 1L; // Serialization version ID
    private List<Course> coursesTaught; // List of courses the staff member teaches

    /**
     * Constructs a {@code Staff_Teacher} object with the specified name, age, address, department, and position.
     * This constructor calls the {@link StaffOnly} constructor to initialize the common staff attributes.
     * 
     * @param name the name of the staff teacher
     * @param age the age of the staff teacher
     * @param address the address of the staff teacher, represented as an {@link Address} object
     * @param department the department where the staff teacher works
     * @param position the position or role of the staff teacher within the department
     */
    public Staff_Teacher(String name, int age, Address address, String department, String position) {
        super(name, age, address, department, position); // Call to StaffOnly constructor
        this.coursesTaught = new ArrayList<>(); // Initialize the list of courses taught
    }

    /**
     * Teaches a course by adding it to the list of courses taught by the staff teacher.
     * 
     * @param course the course that the staff teacher is teaching, represented as a {@link Course} object
     */
    @Override
    public void teachCourse(Course course) {
        coursesTaught.add(course);
        System.out.println(getName() + " is teaching course: " + course.getCourseName());
    }

    /**
     * Grades a student on a specific assignment and prints the result.
     * 
     * @param student the {@link RegularStudent} being graded
     * @param assignment the {@link Assignment} being graded
     * @param grade the grade given to the student
     */
    @Override
    public void gradeStudent(RegularStudent student, Assignment assignment, int grade) {
        System.out.println("Graded student ID " + student.getStudentID() + 
                           " on assignment: " + assignment.getAssignmentName() + 
                           " with grade: " + grade);
    }

    /**
     * Returns the list of courses taught by the staff teacher.
     * 
     * @return a list of {@link Course} objects representing the courses taught by the staff teacher
     */
    @Override
    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }

    /**
     * Overrides the {@code toString} method to provide a string representation of the staff teacher.
     * The string includes the staff teacher's name, age, address, department, position, and the number of courses taught.
     * 
     * @return a string representation of the staff teacher
     */
    @Override
    public String toString() {
        return super.toString() + ", Courses Taught: " + coursesTaught.size();
    }
}
