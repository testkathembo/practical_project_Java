package projectschoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;

// PhDStudent class extends RegularStudent and implements the Teacher interface
public class PhDStudent extends RegularStudent implements Teacher {
    private int studentID;          // Unique student ID (camelCase convention)
    private String department;      // Department where the PhD student teaches
    private List<Course> coursesTaught = new ArrayList<>(); // List of courses taught by the PhD student

    // Constructor to initialize PhD student attributes
    public PhDStudent(String name, int age, Address address, int studentID, String department) {
        super(name, age, address, studentID); // Call to RegularStudent constructor
        this.department = department;        // Set the department
    }

    // Method to teach a course, as required by the Teacher interface
    @Override
    public void teachCourse(Course course) {
        coursesTaught.add(course); // Add course to the list of courses taught
        System.out.println(getName() + " is teaching course: " + course.getCourseName());
    }

    // Method to grade a student, as required by the Teacher interface
    @Override
    public void gradeStudent(RegularStudent student, Assignment assignment, int grade) {
       
        System.out.println("Graded student ID " + student.getStudentID() + 
                           " on assignment: " + assignment.getAssignmentName() + 
                           " with grade: " + grade);
    }

    // Getter for the list of courses taught
    @Override
    public List<Course> getCoursesTaught() {
        return coursesTaught; // Return the list of courses taught
    }

    // Override toString to include PhD student details and department information
    @Override
    public String toString() {
        return super.toString() + ", Department: " + department; // Include department info
    }
}
