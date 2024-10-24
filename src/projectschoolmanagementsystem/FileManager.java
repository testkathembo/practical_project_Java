package projectschoolmanagementsystem;

import java.io.*;
import java.util.List;

/**
 * FileManager class for saving and loading students, courses, teachers, and classrooms to and from files.
 * @author Dieudonne
 */
public class FileManager {

    /**
     * This method saves the list of students to a file.
     * @param students the list of students to be saved
     */
    public static void saveStudentToFile(List<RegularStudent> students) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
            out.writeObject(students); // write the list of students to file
            System.out.println("Student data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving student data: " + e.getMessage());
        }
    }

    /**
     * This method loads the list of students from a file.
     * @return the list of students loaded from file
     */
    public static List<RegularStudent> loadStudentsFromFile() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.dat"))) {
            return (List<RegularStudent>) in.readObject(); // Read the list of students from file
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading student data: " + e.getMessage());
            return null;
        }
    }

    /**
     * This method saves the list of courses to a file.
     * @param courses the list of courses to be saved
     */
    public static void saveCoursesToFile(List<Course> courses) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("courses.dat"))) {
            out.writeObject(courses); // Write the list of courses to file
            System.out.println("Course data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving course data: " + e.getMessage());
        }
    }

    /**
     * This method loads the list of courses from a file.
     * @return the list of courses loaded from file
     */
    public static List<Course> loadCoursesFromFile() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("courses.dat"))) {
            return (List<Course>) in.readObject(); // Read the list of courses from file
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading course data: " + e.getMessage());
            return null;
        }
    }

    /**
     * This method saves the list of teachers to a file.
     * @param teachers the list of teachers to be saved
     */
    public static void saveTeacherToFile(List<Teacher> teachers) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("teachers.dat"))) {
            out.writeObject(teachers);
            System.out.println("Teacher data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving teacher data: " + e.getMessage());
        }
    }

    /**
     * This method loads the list of teachers from a file.
     * @return the list of teachers loaded from file
     */
    public static List<Teacher> loadTeacherFromFile() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("teachers.dat"))) {
            return (List<Teacher>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading teacher data: " + e.getMessage());
            return null;
        }
    }

    /**
     * This method saves the list of classrooms to a file.
     * @param classrooms the list of classrooms to be saved
     */
    public static void saveClassroomsToFile(List<Classroom> classrooms) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("classrooms.dat"))) {
            out.writeObject(classrooms);
            System.out.println("Classroom data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving classroom data: " + e.getMessage());
        }
    }

    /**
     * This method loads the list of classrooms from a file.
     * @return the list of classrooms loaded from file
     */
    public static List<Classroom> loadClassroomsFromFile() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("classrooms.dat"))) {
            return (List<Classroom>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading classroom data: " + e.getMessage());
            return null;
        }
    }

    /**
     * This method saves all data (students, courses, teachers, classrooms) to their respective files.
     * @param students the list of students to be saved
     * @param courses the list of courses to be saved
     * @param teachers the list of teachers to be saved
     * @param classrooms the list of classrooms to be saved
     */
    public static void saveAllData(List<RegularStudent> students, List<Course> courses, List<Teacher> teachers, List<Classroom> classrooms) {
        saveStudentToFile(students);
        saveCoursesToFile(courses);
        saveTeacherToFile(teachers);
        saveClassroomsToFile(classrooms);
    }

    /**
     * This method loads all data (students, courses, teachers, classrooms) from their respective files.
     * @return an array containing the lists of students, courses, teachers, and classrooms
     */
    public static Object[] loadAllData() {
        List<RegularStudent> students = loadStudentsFromFile();
        List<Course> courses = loadCoursesFromFile();
        List<Teacher> teachers = loadTeacherFromFile();
        List<Classroom> classrooms = loadClassroomsFromFile();
        return new Object[] {students, courses, teachers, classrooms};
    }
}
