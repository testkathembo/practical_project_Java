package projectschoolmanagementsystem;
import java.io.Serializable;

/**
 * Represents an address that stores the street, city, country, phone, and email information.
 * Implements {@link Serializable} to allow instances of this class to be serialized for file storage.
 * 
 * The class includes getter and setter methods for each attribute as well as a toString method for displaying the full address.
 * 
 * @author Dieudonne
 */
public class Address implements Serializable {

    private static final long serialVersionUID = 1L; // Unique identifier for serialization
    
    private String Street;  // The street address
    private String City;    // The city of the address
    private String Country; // The country of the address
    private String Phone;   // The phone number associated with the address
    private String Email;   // The email address associated with the address

    /**
     * Constructs an Address object with the specified details.
     * 
     * @param street The street address.
     * @param city The city where the address is located.
     * @param country The country of the address.
     * @param phone The phone number associated with the address.
     * @param email The email address associated with the address.
     */
    public Address(String street, String city, String country, String phone, String email) {
        this.Street = street;
        this.City = city;
        this.Country = country;
        this.Phone = phone;
        this.Email = email;
    }

    /**
     * Gets the street address.
     * 
     * @return The street as a String.
     */
    public String getStreet() {
        return Street;
    }

    /**
     * Sets the street address.
     * 
     * @param street The new street address to be set.
     */
    public void setStreet(String street) {
        this.Street = street;
    }

    /**
     * Gets the city of the address.
     * 
     * @return The city as a String.
     */
    public String getCity() {
        return City;
    }

    /**
     * Sets the city of the address.
     * 
     * @param city The new city to be set.
     */
    public void setCity(String city) {
        this.City = city;
    }

    /**
     * Gets the country of the address.
     * 
     * @return The country as a String.
     */
    public String getCountry() {
        return Country;
    }

    /**
     * Sets the country of the address.
     * 
     * @param country The new country to be set.
     */
    public void setCountry(String country) {
        this.Country = country;
    }

    /**
     * Gets the email associated with this address.
     * 
     * @return The email as a String.
     */
    public String getEmail() {
        return Email;
    }

    /**
     * Sets the email associated with this address.
     * 
     * @param email The new email to be set.
     */
    public void setEmail(String email) {
        this.Email = email;
    }

    /**
     * Gets the phone number associated with this address.
     * 
     * @return The phone number as a String.
     */
    public String getPhone() {
        return Phone;
    }

    /**
     * Sets the phone number associated with this address.
     * 
     * @param phone The new phone number to be set.
     */
    public void setPhone(String phone) {
        this.Phone = phone;
    }

    /**
     * Returns a string representation of the full address.
     * 
     * @return A formatted string containing the street, city, country, phone, and email.
     */
    @Override
    public String toString() {
        return Street + ", " + City + ", " + Country + " " + Phone + " " + Email;
    }
}

