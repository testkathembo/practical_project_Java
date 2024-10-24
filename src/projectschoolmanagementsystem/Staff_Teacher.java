package projectschoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

// This class represents a staff member who is also a teacher
public class Staff_Teacher extends StaffOnly implements Teacher {
    private static final long SerialVersionUID = 1L;
    private List<Course> coursesTaught; // List of courses the staff member teaches

    // Constructor to initialize Staff_Teacher attributes
    public Staff_Teacher(String name, int age, Address address, String department, String position) {
        super(name, age, address, department, position); // Call the constructor of the Staff class
        this.coursesTaught = new ArrayList<>(); // Initialize the list of courses taught
    }

    // Method to teach a course
    public void teachCourse(Course course) {
        coursesTaught.add(course);
        System.out.println(getName() + " is teaching course: " + course.getCourseName());
    }

    // Method to grade a student on a specific assignment
    public void gradeStudent(RegularStudent student, Assignment assignment, int grade) {
        
        System.out.println("Graded student ID " + student.getStudentID() + 
                           " on assignment: " + assignment.getAssignmentName() + 
                           " with grade: " + grade);
    }

    // Getter for the list of courses taught
    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }

    @Override
    public String toString() {
        return super.toString() + ", Courses Taught: " + coursesTaught.size();
    }
}

