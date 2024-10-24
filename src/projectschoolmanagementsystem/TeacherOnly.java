package projectschoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * The {@code TeacherOnly} class represents a full-time teacher within the school management system.
 * This class implements the {@link Teacher} interface, meaning it provides functionality to teach courses, grade students, and manage the courses taught.
 * <p>
 * This class extends {@link Person} and adds department information specific to the teacher.
 * </p>
 *
 * <p>Example usage:
 * <pre>
 *     TeacherOnly teacher = new TeacherOnly("John Doe", 45, new Address("123 Main St", "City", "Country", "1234567890", "email@example.com"), "Mathematics");
 *     teacher.teachCourse(new OnCampus("CS101", "Introduction to Programming", "Room 101"));
 *     teacher.gradeStudent(student, new Assignment("Assignment 1"), 90);
 * </pre>
 * </p>
 *
 * @author User
 * @version 1.0
 */
public class TeacherOnly extends Person implements Teacher {
    private static final long SerialVersionUID = 1L; // Serialization practice
    private List<Course> coursesTaught; // List of courses taught by the teacher
    private String department; // Department to which the teacher belongs

    /**
     * Constructs a {@code TeacherOnly} object with the specified name, age, address, and department.
     *
     * @param name the name of the teacher
     * @param age the age of the teacher
     * @param address the address of the teacher, represented as an {@link Address} object
     * @param department the department to which the teacher belongs
     */
    public TeacherOnly(String name, int age, Address address, String department) {
        super(name, age, address);
        this.department = department;
        this.coursesTaught = new ArrayList<>();
    }

    /**
     * Teaches a course by adding it to the teacher's list of courses.
     * This method is called when a teacher begins teaching a new course.
     *
     * @param course the course to be taught, represented as a {@link Course} object
     */
    @Override
    public void teachCourse(Course course) {
        coursesTaught.add(course);
        System.out.println(getName() + " is teaching course: " + course.getCourseName());
    }

    /**
     * Grades a student on a specific assignment and records the grade.
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
     * Returns the list of courses taught by the teacher.
     *
     * @return a list of {@link Course} objects representing the courses taught by the teacher
     */
    @Override
    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }

    /**
     * Returns the department of the teacher.
     *
     * @return the department name as a {@link String}
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department for the teacher.
     *
     * @param department the name of the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Provides a string representation of the {@code TeacherOnly} object.
     * The string includes the teacher's name, age, address, and department.
     *
     * @return a formatted string representing the teacher
     */
    @Override
    public String toString() {
        return super.toString() + ", Department: " + department;
    }
}
