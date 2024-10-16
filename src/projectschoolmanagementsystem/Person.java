package projectschoolmanagementsystem;

// This class represents a person with a name, age, and address
public class Person {
    private String name; // This is the name of the person
    private int age;     // This is the age of the person
    private Address address; // This is the object representing the person's address

    // Constructor to initialize the Person object with name, age, and address
    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    // Method indicating the person is attending an event
    public void attend() {
        System.out.println(name + " is attending.");
    }

    // Getter and Setter methods for each attribute
    public String getName() {
        return name; // This will return the name object of the person
    }

    public void setName(String name) {
        this.name = name; // This will update the name of the person
    }

    public int getAge() {
        return age; // This will return the age object of the person
    }

    public void setAge(int age) {
        this.age = age; // This will update the age of the person
    }

    public Address getAddress() {
        return address; // This will return the Address object of the person
    }

    public void setAddress(Address address) {
        this.address = address; // This will update the address of the person
    }
}

