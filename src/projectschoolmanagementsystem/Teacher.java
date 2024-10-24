package projectschoolmanagementsystem;

import java.util.List;

/**
 * The {@code Teacher} interface defines the essential responsibilities of a teacher within the school management system.
 * Implementing classes must provide implementations for teaching courses, grading students, and managing the list of courses taught.
 *
 * <p>Example of classes implementing this interface include:
 * <ul>
 *     <li>{@link Staff_Teacher}</li>
 *     <li>{@link PhDStudent}</li>
 * </ul>
 *
 * <p>Example usage:
 * <pre>
 *     Teacher teacher = new Staff_Teacher("John Doe", 40, address, "Computer Science", "Lecturer");
 *     Course course = new OnCampus("CS101", "Intro to Programming", "Room 101");
 *     teacher.teachCourse(course);
 *     teacher.gradeStudent(student, assignment, 85);
 * </pre>
 * </p>
 *
 * @author User
 * @version 1.0
 */
public interface Teacher {

    /**
     * Teaches a course by adding it to the list of courses taught by the teacher.
     * This method is typically called when the teacher starts teaching a new course.
     *
     * @param course the course to be taught by the teacher, represented as a {@link Course} object
     */
    void teachCourse(Course course);

    /**
     * Grades a student on a specific assignment and records the result.
     *
     * @param student the student being graded, represented as a {@link RegularStudent} object
     * @param assignment the assignment being graded, represented as an {@link Assignment} object
     * @param grade the grade given to the student for the assignment
     */
    void gradeStudent(RegularStudent student, Assignment assignment, int grade);

    /**
     * Returns the list of courses taught by the teacher.
     * This method provides access to the teacher's course load or the courses they are currently responsible for.
     *
     * @return a list of {@link Course} objects representing the courses taught by the teacher
     */
    List<Course> getCoursesTaught();
}
