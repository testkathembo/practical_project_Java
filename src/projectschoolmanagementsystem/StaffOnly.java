package projectschoolmanagementsystem;

/**
 * The {@code StaffOnly} class represents a staff member in the school management system.
 * It extends the {@link Person} class and adds additional attributes related to a staff member's
 * department and position.
 * 
 * <p>Staff members can perform tasks, and their details include the department and position
 * they hold within the institution.</p>
 * 
 * <p>Example usage:
 * <pre>
 *     StaffOnly staff = new StaffOnly("John Doe", 35, new Address("456 Oak St", "Metropolis", "USA", "555-6789", "john.doe@example.com"), "IT", "Administrator");
 *     staff.performTask("Setup the network");
 * </pre>
 * </p>
 * 
 * @author User
 * @version 1.0
 */
public class StaffOnly extends Person {
    private String department; // The department where the staff member works
    private String position; // The position or role of the staff member within the department

    /**
     * Constructs a {@code StaffOnly} object with the specified name, age, address, department, and position.
     * This constructor calls the {@code Person} constructor to initialize the common person attributes.
     * 
     * @param name the name of the staff member
     * @param age the age of the staff member
     * @param address the address of the staff member, represented as an {@link Address} object
     * @param department the department where the staff member works
     * @param position the position or role of the staff member within the department
     */
    public StaffOnly(String name, int age, Address address, String department, String position) {
        super(name, age, address); // Call to Person constructor
        this.department = department; // Set the department
        this.position = position; // Set the position
    }

    /**
     * Returns the department where the staff member works.
     * 
     * @return the department of the staff member as a {@link String}
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department for the staff member.
     * This method allows updating the department of the staff member.
     * 
     * @param department the new department for the staff member
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Returns the position or role of the staff member within the department.
     * 
     * @return the position of the staff member as a {@link String}
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the position for the staff member.
     * This method allows updating the position or role of the staff member within the department.
     * 
     * @param position the new position for the staff member
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Simulates the staff member performing a specified task by printing a message to the console.
     * 
     * @param task the task that the staff member is performing, represented as a {@link String}
     */
    public void performTask(String task) {
        System.out.println(getName() + " is performing task: " + task);
    }

    /**
     * Overrides the {@code toString} method to provide a string representation of the staff member.
     * The string includes the person's name, age, address, department, and position.
     * 
     * @return a string representation of the staff member
     */
    @Override
    public String toString() {
        return super.toString() + ", Department: " + department + ", Position: " + position;
    }
}
