package projectschoolmanagementsystem;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 * Main class for the Project School Management System.
 * This class allows the user to manage students, courses, teachers, and classrooms.
 * Users can interact with the system via a console-based interface to perform tasks
 * such as adding students, enrolling students in courses, assigning teachers, and more.
 */
public class ProjectSchoolManagementSystem {

    // Lists to store students, courses, teachers, and classrooms
    private static List<RegularStudent> students = new ArrayList<>();
    private static List<Course> courses = new ArrayList<>();
    private static List<Teacher> teachers = new ArrayList<>();
    private static List<Classroom> classrooms = new ArrayList<>();

    /**
     * Main method to run the School Management System.
     * Displays a menu for the user to interact with the system.
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            try {
                // Display the menu
                System.out.println("\n=== School Management System ===");
                System.out.println("1. Add New Student");
                System.out.println("2. Enroll Student in Course");
                System.out.println("3. Add New Course");
                System.out.println("4. Add New Teacher");
                System.out.println("5. Add New Classroom");
                System.out.println("6. Assign Teacher to Course");
                System.out.println("7. Create and Grade Assignment");
                System.out.println("8. Conduct Exam");
                System.out.println("9. View Student Details");
                System.out.println("10. View Teacher Details");
                System.out.println("11. Exit");
                System.out.print("Choose an option (1-11): ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline

                // Handle user input
                switch (choice) {
                    case 1:
                        addNewStudent(scanner);
                        break;
                    case 2:
                        enrollStudentInCourse(scanner);
                        break;
                    case 3:
                        addNewCourse(scanner);
                        break;
                    case 4:
                        addNewTeacher(scanner);
                        break;
                    case 5:
                        addNewClassroom(scanner);
                        break;
                    case 6:
                        assignTeacherToCourse(scanner);
                        break;
                    case 7:
                        createAndGradeAssignment(scanner);
                        break;
                    case 8:
                        conductExam();
                        break;
                    case 9:
                        viewStudentDetails(scanner);
                        break;
                    case 10:
                        viewTeacherDetails();
                        break;
                    case 11:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option. Please choose again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number between 1 and 11.");
                scanner.nextLine(); // Clear the invalid input
            }
        }

        scanner.close();
    }

    /**
     * Adds a new student by prompting the user for student details.
     * The student's name, age, and address are collected, and the student is added to the system.
     * @param scanner Scanner object to read user input.
     */
    private static void addNewStudent(Scanner scanner) {
        try {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            int age = 0;
            boolean validInput = false;

            // Loop to get a valid integer input for age
            while (!validInput) {
                try {
                    System.out.print("Enter student age: ");
                    age = scanner.nextInt();
                    validInput = true; // Exit loop if input is valid
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a valid integer for age.");
                    scanner.nextLine(); // Clear invalid input
                }
            }

            scanner.nextLine(); // Consume newline

            // Collect remaining student details
            System.out.print("Enter student address (Street): ");
            String street = scanner.nextLine();
            System.out.print("Enter student city: ");
            String city = scanner.nextLine();
            System.out.print("Enter student country: ");
            String country = scanner.nextLine();
            System.out.print("Enter student phone number: ");
            String phone = scanner.nextLine();
            System.out.print("Enter student email: ");
            String email = scanner.nextLine();

            Address newAddress = new Address(street, city, country, phone, email);

            int studentID = 0;
            validInput = false;

            // Loop to validate student ID input
            while (!validInput) {
                try {
                    System.out.print("Enter student ID: ");
                    studentID = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a valid integer for student ID.");
                    scanner.nextLine(); // Clear invalid input
                }
            }

            // Add the new student to the list
            RegularStudent newStudent = new RegularStudent(name, age, newAddress, studentID);
            students.add(newStudent);

            System.out.println("New student added: " + newStudent.getName());
        } catch (Exception e) {
            System.out.println("Error occurred while adding a new student: " + e.getMessage());
        }
    }

    /**
     * Enrolls a student in a course by allowing the user to choose from the list of available students and courses.
     * @param scanner Scanner object to read user input.
     */
    private static void enrollStudentInCourse(Scanner scanner) {
        try {
            if (students.isEmpty()) {
                System.out.println("No students available. Please add a student first.");
                return;
            }

            // Select a student
            System.out.println("Choose a student to enroll:");
            for (int i = 0; i < students.size(); i++) {
                System.out.println((i + 1) + ". " + students.get(i).getName());
            }

            int studentChoice = scanner.nextInt();
            if (studentChoice < 1 || studentChoice > students.size()) {
                System.out.println("Invalid student choice.");
                return;
            }
            RegularStudent selectedStudent = students.get(studentChoice - 1);

            if (courses.isEmpty()) {
                System.out.println("No courses available. Please add a course first.");
                return;
            }

            // Select a course
            System.out.println("Choose a course to enroll the student in:");
            for (int i = 0; i < courses.size(); i++) {
                System.out.println((i + 1) + ". " + courses.get(i).getCourseName());
            }
            int courseChoice = scanner.nextInt();
            if (courseChoice < 1 || courseChoice > courses.size()) {
                System.out.println("Invalid course choice.");
                return;
            }

            Course selectedCourse = courses.get(courseChoice - 1);
            selectedStudent.enrollInCourse(selectedCourse);
            System.out.println(selectedStudent.getName() + " has been enrolled in " + selectedCourse.getCourseName());
        } catch (Exception e) {
            System.out.println("Error occurred while enrolling a student in a course: " + e.getMessage());
        }
    }

    /**
     * Adds a new course by prompting the user for course details (course ID, name, type, etc.).
     * @param scanner Scanner object to read user input.
     */
    private static void addNewCourse(Scanner scanner) {
        try {
            System.out.print("Enter course ID: ");
            String courseID = scanner.nextLine();

            System.out.print("Enter course name: ");
            String courseName = scanner.nextLine();

            System.out.print("Is this an On-Campus (1) or Online (2) course? ");
            int courseType = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            Course newCourse;
            if (courseType == 1) {
                System.out.print("Enter classroom location: ");
                String location = scanner.nextLine();
                newCourse = new OnCampus(courseID, courseName, location);
            } else {
                System.out.print("Enter platform for online course: ");
                String platform = scanner.nextLine();
                newCourse = new Online(courseID, courseName, platform);
            }

            // Add new course to the list
            courses.add(newCourse);
            System.out.println("New course added: " + newCourse.getCourseName());
        } catch (Exception e) {
            System.out.println("Error occurred while adding a new course: " + e.getMessage());
        }
    }

        /**
     * Adds a new teacher by prompting the user for teacher details (name, age, department, etc.).
     * @param scanner Scanner object to read user input.
     */
    private static void addNewTeacher(Scanner scanner) {
        try {
            System.out.print("Enter teacher name: ");
            String name = scanner.nextLine();

            int age = 0;
            boolean validInput = false;

            // Loop to validate age input
            while (!validInput) {
                try {
                    System.out.print("Enter teacher age: ");
                    age = scanner.nextInt();
                    validInput = true; // Exit loop if input is valid
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a valid integer for age.");
                    scanner.nextLine(); // Clear invalid input
                }
            }

            scanner.nextLine(); // Consume newline

            // Collect remaining teacher details
            System.out.print("Enter teacher department: ");
            String department = scanner.nextLine();

            System.out.print("Enter teacher address (Street): ");
            String street = scanner.nextLine();
            System.out.print("Enter teacher city: ");
            String city = scanner.nextLine();
            System.out.print("Enter teacher country: ");
            String country = scanner.nextLine();
            System.out.print("Enter teacher phone number: ");
            String phone = scanner.nextLine();
            System.out.print("Enter teacher email: ");
            String email = scanner.nextLine();

            Address newAddress = new Address(street, city, country, phone, email);

            // Determine type of teacher
            System.out.print("Is this a Staff Teacher (1) or Teacher Only (2)? ");
            int teacherType = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            Teacher newTeacher;
            if (teacherType == 1) {
                System.out.print("Enter position for staff teacher: ");
                String position = scanner.nextLine();
                newTeacher = new Staff_Teacher(name, age, newAddress, department, position);
            } else {
                newTeacher = new TeacherOnly(name, age, newAddress, department);
            }

            // Add new teacher to the list
            teachers.add(newTeacher);
            System.out.println("New teacher added: " + ((Person) newTeacher).getName());
        } catch (Exception e) {
            System.out.println("Error occurred while adding a new teacher: " + e.getMessage());
        }
    }

    /**
     * Adds a new classroom by prompting the user for classroom details (ID, capacity, etc.).
     * @param scanner Scanner object to read user input.
     */
    private static void addNewClassroom(Scanner scanner) {
        try {
            System.out.print("Enter classroom ID: ");
            String classroomID = scanner.nextLine();

            int capacity = 0;
            boolean validInput = false;

            // Loop to validate capacity input
            while (!validInput) {
                try {
                    System.out.print("Enter classroom capacity: ");
                    capacity = scanner.nextInt();
                    if (capacity > 0) {
                        validInput = true; // Valid capacity input
                    } else {
                        System.out.println("Invalid input! Capacity must be greater than zero.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a valid integer for capacity.");
                    scanner.nextLine(); // Clear invalid input
                }
            }

            // Create and add new classroom to the list
            Classroom newClassroom = new Classroom(classroomID, capacity);
            classrooms.add(newClassroom);

            System.out.println("New classroom added: " + newClassroom.getClassroomID());
        } catch (Exception e) {
            System.out.println("Error occurred while adding a new classroom: " + e.getMessage());
        }
    }

    /**
     * Assigns a teacher to a course by allowing the user to choose from available teachers and courses.
     * @param scanner Scanner object to read user input.
     */
    private static void assignTeacherToCourse(Scanner scanner) {
        try {
            if (teachers.isEmpty()) {
                System.out.println("No teachers available. Please add a teacher first.");
                return;
            }

            // Select a teacher
            System.out.println("Choose a teacher to assign:");
            for (int i = 0; i < teachers.size(); i++) {
                System.out.println((i + 1) + ". " + ((Person) teachers.get(i)).getName());
            }
            int teacherChoice = scanner.nextInt();
            if (teacherChoice < 1 || teacherChoice > teachers.size()) {
                System.out.println("Invalid teacher choice.");
                return;
            }
            Teacher selectedTeacher = teachers.get(teacherChoice - 1);

            if (courses.isEmpty()) {
                System.out.println("No courses available. Please add a course first.");
                return;
            }

            // Select a course
            System.out.println("Choose a course to assign the teacher to:");
            for (int i = 0; i < courses.size(); i++) {
                System.out.println((i + 1) + ". " + courses.get(i).getCourseName());
            }
            int courseChoice = scanner.nextInt();
            if (courseChoice < 1 || courseChoice > courses.size()) {
                System.out.println("Invalid course choice.");
                return;
            }

            Course selectedCourse = courses.get(courseChoice - 1);

            // Assign the teacher to the selected course
            selectedTeacher.teachCourse(selectedCourse);
            System.out.println("Teacher " + ((Person) selectedTeacher).getName() + " assigned to course: " + selectedCourse.getCourseName());
        } catch (Exception e) {
            System.out.println("Error occurred while assigning a teacher to a course: " + e.getMessage());
        }
    }

    /**
     * Creates an assignment and allows the teacher to grade a student on the assignment.
     * @param scanner Scanner object to read user input.
     */
    private static void createAndGradeAssignment(Scanner scanner) {
        try {
            System.out.print("Enter assignment name: ");
            String assignmentName = scanner.nextLine();
            Assignment newAssignment = new Assignment(assignmentName);

            if (teachers.isEmpty()) {
                System.out.println("No teachers available.");
                return;
            }

            // Select a teacher
            System.out.println("Choose a teacher to grade the assignment:");
            for (int i = 0; i < teachers.size(); i++) {
                System.out.println((i + 1) + ". " + ((Person) teachers.get(i)).getName());
            }
            int teacherChoice = scanner.nextInt();
            if (teacherChoice < 1 || teacherChoice > teachers.size()) {
                System.out.println("Invalid teacher choice.");
                return;
            }
            Teacher selectedTeacher = teachers.get(teacherChoice - 1);

            if (students.isEmpty()) {
                System.out.println("No students available.");
                return;
            }

            // Select a student
            System.out.println("Choose a student to grade:");
            for (int i = 0; i < students.size(); i++) {
                System.out.println((i + 1) + ". " + students.get(i).getName());
            }
            int studentChoice = scanner.nextInt();
            if (studentChoice < 1 || studentChoice > students.size()) {
                System.out.println("Invalid student choice.");
                return;
            }
            RegularStudent selectedStudent = students.get(studentChoice - 1);

            // Get the grade
            System.out.print("Enter grade for the assignment: ");
            int grade = scanner.nextInt();

            // Grade the student
            selectedTeacher.gradeStudent(selectedStudent, newAssignment, grade);
            System.out.println("Assignment graded for student: " + selectedStudent.getName() + ", Grade: " + grade);
        } catch (Exception e) {
            System.out.println("Error occurred while creating and grading an assignment: " + e.getMessage());
        }
    }

    /**
     * Conducts exams for all available courses.
     * Iterates through each course and calls the conductExam method.
     */
    private static void conductExam() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }

        try {
            for (Course course : courses) {
                course.conductExam();
            }
        } catch (Exception e) {
            System.out.println("Error occurred while conducting exams: " + e.getMessage());
        }
    }

    /**
     * Displays student details by allowing the user to select a student from the list.
     * @param scanner Scanner object to read user input.
     */
    private static void viewStudentDetails(Scanner scanner) {
        try {
            if (students.isEmpty()) {
                System.out.println("No students available.");
                return;
            }

            // Select a student
            System.out.println("Choose a student to view details:");
            for (int i = 0; i < students.size(); i++) {
                System.out.println((i + 1) + ". " + students.get(i).getName());
            }
            int studentChoice = scanner.nextInt();
            if (studentChoice < 1 || studentChoice > students.size()) {
                System.out.println("Invalid student choice.");
                return;
            }
            RegularStudent selectedStudent = students.get(studentChoice - 1);

            // Display student details and enrolled courses
            System.out.println("Student Details:");
            System.out.println(selectedStudent);
            System.out.println("Enrolled Courses:");
            for (Course course : selectedStudent.getCourses()) {
                System.out.println(" - " + course.getCourseName());
            }
        } catch (Exception e) {
            System.out.println("Error occurred while viewing student details: " + e.getMessage());
        }
    }

    /**
     * Displays details of all available teachers.
     * Iterates through the teacher list and displays their details and courses they teach.
     */
    private static void viewTeacherDetails() {
        try {
            if (teachers.isEmpty()) {
                System.out.println("No teachers available.");
                return;
            }

            for (Teacher teacher : teachers) {
                System.out.println("Teacher Details:");
                System.out.println(teacher);
                System.out.println("Courses Taught:");
                for (Course course : teacher.getCoursesTaught()) {
                    System.out.println(" - " + course.getCourseName());
                }
            }
        } catch (Exception e) {
            System.out.println("Error occurred while viewing teacher details: " + e.getMessage());
        }
    }

}
