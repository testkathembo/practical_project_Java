package projectschoolmanagementsystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.Serializable;

/**
 * The {@code Department} class represents an academic department in the school management system.
 * It maintains a list of teachers (staff members) and courses offered by the department.
 * This class provides methods to add new teachers and courses and retrieve information about the department.
 * 
 * The class ensures that lists of teachers and courses are unmodifiable externally to prevent unauthorized changes.
 * 
 * <p>Example usage:
 * <pre>
 *     Department computerScience = new Department("CS");
 *     computerScience.addTeacher(new StaffOnly(...));
 *     computerScience.addCourse(new OnCampus(...));
 * </pre>
 * </p>
 * 
 * @author Dieudonne
 * @version 1.0
 */
public class Department implements Serializable {
    private static final long SerialVersionUID = 1L;

    /** Unique identifier for the department */
    private String departmentID;

    /** List of teachers (staff members) in the department */
    private List<StaffOnly> teachers;

    /** List of courses offered by the department */
    private List<Course> coursesOffered;

    /**
     * Constructs a {@code Department} object with the specified department ID.
     * Initializes empty lists for teachers and courses.
     * 
     * @param departmentID the unique identifier for the department
     */
    public Department(String departmentID) {
        this.departmentID = departmentID;
        this.teachers = new ArrayList<>();
        this.coursesOffered = new ArrayList<>();
    }

    /**
     * Adds a new course to the department if it is not already offered.
     * 
     * @param course the {@code Course} object to be added
     * @throws IllegalArgumentException if the course is null
     */
    public void addCourse(Course course) {
        if (course == null) {
            System.out.println("Invalid course. Cannot add null course.");
            return;
        }
        if (!coursesOffered.contains(course)) {
            this.coursesOffered.add(course);
            System.out.println("Course added: " + course.getCourseName());
        } else {
            System.out.println("Course already offered: " + course.getCourseName());
        }
    }

    /**
     * Adds a new teacher to the department's list of teachers if they are not already added.
     * 
     * @param teacher the {@code StaffOnly} object representing the teacher
     * @throws IllegalArgumentException if the teacher is null
     */
    public void addTeacher(StaffOnly teacher) {
        if (teacher == null) {
            System.out.println("Invalid teacher. Cannot add null teacher.");
            return;
        }
        if (!teachers.contains(teacher)) {
            this.teachers.add(teacher);
            System.out.println("Teacher added: " + teacher.getName());
        } else {
            System.out.println("Teacher is already part of the department: " + teacher.getName());
        }
    }

    /**
     * Returns an unmodifiable list of courses offered by the department.
     * 
     * @return an unmodifiable {@code List} of {@code Course} objects
     */
    public List<Course> getCoursesOffered() {
        return Collections.unmodifiableList(coursesOffered);
    }

    /**
     * Returns the unique identifier of the department.
     * 
     * @return the department ID
     */
    public String getDepartmentID() {
        return departmentID;
    }

    /**
     * Sets the unique identifier of the department.
     * 
     * @param departmentID the new department ID
     */
    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    /**
     * Returns an unmodifiable list of teachers in the department.
     * 
     * @return an unmodifiable {@code List} of {@code StaffOnly} objects
     */
    public List<StaffOnly> getTeachers() {
        return Collections.unmodifiableList(teachers);
    }

    /**
     * Returns a string representation of the department, including department ID,
     * the names of teachers, and the names of courses offered.
     * 
     * @return a string representation of the department
     */
    @Override
    public String toString() {
        return "Department ID: " + departmentID +
               "\nTeachers: " + getTeacherNames() +
               "\nCourses Offered: " + getCourseNames();
    }

    /**
     * Helper method to retrieve the names of all teachers in the department.
     * 
     * @return a string containing the names of all teachers
     */
    private String getTeacherNames() {
        if (teachers.isEmpty()) {
            return "No teachers.";
        }
        StringBuilder teacherNames = new StringBuilder();
        for (StaffOnly teacher : teachers) {
            teacherNames.append(teacher.getName()).append(", ");
        }
        return teacherNames.substring(0, teacherNames.length() - 2); // Remove trailing comma
    }

    /**
     * Helper method to retrieve the names of all courses offered by the department.
     * 
     * @return a string containing the names of all courses
     */
    private String getCourseNames() {
        if (coursesOffered.isEmpty()) {
            return "No courses offered.";
        }
        StringBuilder courseNames = new StringBuilder();
        for (Course course : coursesOffered) {
            courseNames.append(course.getCourseName()).append(", ");
        }
        return courseNames.substring(0, courseNames.length() - 2); // Remove trailing comma
    }
}
