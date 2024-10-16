package projectschoolmanagementsystem;

import java.util.List;

public interface Teacher {
    void teachCourse(Course course);
    void gradeStudent(RegularStudent student, Assignment assignment, int grade);
    List<Course> getCoursesTaught();
}
