package projectschoolmanagementsystem;

/**
 * Enumeration representing the possible statuses of a course in the school management system.
 * 
 * A course can have one of the following statuses:
 * <ul>
 *   <li>{@code ONGOING} - The course is currently in progress.</li>
 *   <li>{@code COMPLETED} - The course has been successfully completed.</li>
 *   <li>{@code CANCELLED} - The course has been cancelled and will not continue.</li>
 *   <li>{@code PENDING} - The course has not started yet and is pending commencement.</li>
 * </ul>
 * 
 * This enum can be used to track and manage the state of courses.
 * Additional statuses can be added if needed.
 * 
 * Example usage:
 * <pre>
 * {@code
 * CourseStatus status = CourseStatus.ONGOING;
 * }
 * </pre>
 * 
 * @author Dieudonne
 */
public enum CourseStatus {

    /** The course is currently in progress. */
    ONGOING,

    /** The course has been successfully completed. */
    COMPLETED,

    /** The course has been cancelled and will not continue. */
    CANCELLED,

    /** The course has not started yet and is pending commencement. */
    PENDING; // Add more statuses as needed
}
