package projectschoolmanagementsystem;

import java.io.Serializable;

/**
 * The {@code Person} class serves as an abstract base class for representing a person in the school management system.
 * It holds common attributes such as name, age, and address, which are shared by all people (e.g., students, teachers, staff).
 * This class is intended to be extended by more specific person types like students and teachers.
 * 
 * <p>Example usage (via subclass):
 * <pre>
 *     Person student = new RegularStudent("John Doe", 20, new Address("123 Main St", "Cityville", "Country", "1234567890", "email@example.com"));
 *     student.attend();  // Outputs "John Doe is attending."
 * </pre>
 * </p>
 * 
 * @author Dieudonne
 * @version 1.0
 */
public abstract class Person implements Serializable {
    private static final long SerialVersionUID = 1L;

    /** The name of the person */
    protected String name;

    /** The age of the person */
    protected int age;

    /** The address of the person, represented as an {@code Address} object */
    protected Address address;

    /**
     * Constructs a {@code Person} object with the specified name, age, and address.
     * This constructor is typically called by subclasses to initialize the common fields.
     * 
     * @param name the name of the person
     * @param age the age of the person
     * @param address the address of the person
     */
    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * Simulates the person attending an event or class by printing a message to the console.
     */
    public void attend() {
        System.out.println(name + " is attending.");
    }

    /**
     * Returns the name of the person.
     * 
     * @return the name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the person.
     * 
     * @param name the new name of the person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the age of the person.
     * 
     * @return the age of the person
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the person.
     * 
     * @param age the new age of the person
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Returns the address of the person.
     * 
     * @return the address of the person, represented as an {@code Address} object
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the address of the person.
     * 
     * @param address the new address of the person, represented as an {@code Address} object
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * Returns a string representation of the person, including their name, age, and address.
     * 
     * @return a string representation of the person
     */
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}
