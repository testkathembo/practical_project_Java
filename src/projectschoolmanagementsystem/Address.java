package projectschoolmanagementsystem;

public class Address {
    private String Street;
    private String City;    
    private String Country;
    private String Phone;    
    private String Email;


    public Address(String street, String city, String country, String phone, String email) {
        this.Street = city;        
        this.City = city;
        this.Country = country;
        this.Phone = phone;        
        this.Email = email;

    }

   // Getter and Setter methods for each attribute
    public String getStreet() {
        return Street;
    }
    
    public void setStreet(String street) {
        this.Street = street;
    }
    
    public String getCity() {
        return City;
    }
    
    public void setCity(String city) {
        this.City = city;
    }
    
    public String getCountry() {
        return Country;
    }
    
    public void setCountry(String country) {
        this.Country = country;
    }
    
    public String getEmail() {
        return Email;
    }
    
    public void setEmail(String email) {
        this.Email = email;
    }
    
    public String getPhone() {
        return Phone;
    }
    
    public void setPhone(String phone) {
        this.Phone = phone;
    } 
    
    @Override
    public String toString() {
        return Street + ", " + City + ", " + Country + " " + Phone + " " + Email;
    }
}
