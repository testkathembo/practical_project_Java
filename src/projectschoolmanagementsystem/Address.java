/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectschoolmanagementsystem;

// This class represents an Address entity with street, city, country, email, and phone
public class Address {
    private String street; // Street address
    private String city;   // City of the address
    private String country; // Country of the address
    private String email;   // Email associated with the address
    private String phone;   // Phone number associated with the address
    
    // Constructor to initialize the Address object with given variables
    public Address(String street, String city, String country, String email, String phone) {
        this.street = street; 
        this.city = city; 
        this.country = country; 
        this.email = email; 
        this.phone = phone; 
    }
    
    // Getter and Setter methods for each attribute
    public String getStreet() {
        return street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }    
}
