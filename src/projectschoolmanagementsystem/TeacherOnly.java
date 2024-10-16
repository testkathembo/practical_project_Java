package projectschoolmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class TeacherOnly extends Person {
    private List<Course> coursesTaught;
    private String department;

    public TeacherOnly(String name, int age, Address address, String department) {
        super(name, age, address);
        this.department = department;
        this.coursesTaught = new ArrayList<>();
    }

    public void teachCourse(Course course) {
        coursesTaught.add(course);
        System.out.println(getName() + " is teaching course: " + course.getCourseName());
    }

    public void gradeStudent(RegularStudent student, Assignment assignment, int grade) {
        
        System.out.println("Graded student ID " + student.getStudentID() +
                           " on assignment: " + assignment.getAssignmentName() +
                           " with grade: " + grade);
    }

    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department;
    }
}
