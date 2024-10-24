package projectschoolmanagementsystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.Serializable;

public class Department {
    private static final long SerialVersionUID = 1L;
    // Attributes of the Department class
    private String departmentID; // Unique identifier for department
    private List<StaffOnly> teachers; // List of teachers in the department
    private List<Course> coursesOffered; // List of courses offered in the department

    // Constructor to initialize the department object
    public Department(String departmentID) {
        this.departmentID = departmentID;
        this.teachers = new ArrayList<>();
        this.coursesOffered = new ArrayList<>();
    }

    // Method to add a course to the department
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

    // Method to add a new teacher to the department's teacher list
    public void addTeacher(StaffOnly teacher) {  // Use StaffOnly here
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

    // Getter for courses offered, returns an unmodifiable list to prevent external modification
    public List<Course> getCoursesOffered() {
        return Collections.unmodifiableList(coursesOffered);
    }

    // Getter for departmentID
    public String getDepartmentID() {
        return departmentID;
    }

    // Setter for departmentID
    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    // Getter for teachers, returns an unmodifiable list to prevent external modification
    public List<StaffOnly> getTeachers() { // Use StaffOnly here
        return Collections.unmodifiableList(teachers);
    }

    @Override
    public String toString() {
        return "Department ID: " + departmentID +
               "\nTeachers: " + getTeacherNames() +
               "\nCourses Offered: " + getCourseNames();
    }

    // Helper method to get the names of all teachers in the department
    private String getTeacherNames() {
        if (teachers.isEmpty()) {
            return "No teachers.";
        }
        StringBuilder teacherNames = new StringBuilder();
        for (StaffOnly teacher : teachers) { // Use StaffOnly here
            teacherNames.append(teacher.getName()).append(", ");
        }
        return teacherNames.substring(0, teacherNames.length() - 2); // Remove trailing comma
    }

    // Helper method to get the names of all courses offered by the department
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
