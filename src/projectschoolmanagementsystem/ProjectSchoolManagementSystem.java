package projectschoolmanagementsystem;

import java.util.List;

public class ProjectSchoolManagementSystem {

    public static void main(String[] args) {
        // Create an address for a student
        Address studentAddress = new Address("123 Main St", "Springfield", "France", "62701", "dieudonne@gmail.com");
        
        // Create a regular student
        RegularStudent student = new RegularStudent("Alice Johnson", 20, studentAddress, 101);
        
        // Create courses
        Course onCampusCourse = new OnCampus("CS101", "Introduction to Computer Science", "Room 201");
        Course onlineCourse = new Online("CS102", "Data Structures", "Zoom");
        
        // Enroll the student in courses
        student.enrollInCourse(onCampusCourse);
        student.enrollInCourse(onlineCourse);

        // Create a staff teacher
        Staff_Teacher staffTeacher = new Staff_Teacher("Bob Smith", 35, studentAddress, "Computer Science", "Instructor");
        
        // Staff teacher teaches courses
        staffTeacher.teachCourse(onCampusCourse);
        staffTeacher.teachCourse(onlineCourse);
        
        // Create assignments
        Assignment assignment1 = new Assignment("Assignment 1");
        Assignment assignment2 = new Assignment("Assignment 2");

        // Grade the student on assignments
        staffTeacher.gradeStudent(student, assignment1, 95);
        staffTeacher.gradeStudent(student, assignment2, 88);

        // Print details of the student and the courses they are enrolled in
        System.out.println("Student Details:");
        System.out.println(student);
        System.out.println("Courses Enrolled:");
        for (Course course : student.getCourses()) {
            System.out.println(" - " + course.getCourseName());
        }

        // Print teacher details and the courses they are teaching
        System.out.println("\nTeacher Details:");
        System.out.println(staffTeacher);
        System.out.println("Courses Taught:");
        for (Course course : staffTeacher.getCoursesTaught()) {
            System.out.println(" - " + course.getCourseName());
        }

        // Conduct exams for the courses
        onCampusCourse.conductExam();
        onlineCourse.conductExam();
    }
}
