package projectschoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

// This class represents a full-time teacher
public class TeacherOnly extends Person implements Teacher {
    private static final long SerialVersionUID = 1L;
    private List<Course> coursesTaught;
    private String department;

    // Constructor to initialize teacher attributes
    public TeacherOnly(String name, int age, Address address, String department) {
        super(name, age, address);
        this.department = department;
        this.coursesTaught = new ArrayList<>();
    }

    @Override
    public void teachCourse(Course course) {
        coursesTaught.add(course);
        System.out.println(getName() + " is teaching course: " + course.getCourseName());
    }

    @Override
    public void gradeStudent(RegularStudent student, Assignment assignment, int grade) {
        System.out.println("Graded student ID " + student.getStudentID() + 
                " on assignment: " + assignment.getAssignmentName() + 
                " with grade: " + grade);
    }

    @Override
    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department;
    }
}
