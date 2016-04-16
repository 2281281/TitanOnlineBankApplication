package TOBA.Business;

import java.io.Serializable;

public class User implements Serializable {

    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private String email;
    private String username;
    private String password;

    public User() {
        firstName = "";
        lastName = "";
        phone = "";
        address = "";
        address2 = "";
        city = "";
        state = "";
        email = "";
        username = "";
        password = "";
    }

    public User(String firstName, String lastName, String phone, String address, 
            String address2, String city, String state, String zip, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.zip = zip; 
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = lastName;
        
    }
    
    public String getaddress() {
        return address;
    }
    public void setaddress(String address) {
        this.address = address;
    }   
    
        public String getaddress2() {
        return address2;
    }

    public void setaddress2(String address2) {
        this.address2 = address2;
    }
    
            public String getcity() {
        return city;
    }

    public void setcity(String city) {
        this.city = city;
    }
            public String getstate() {
        return state;
    }

    public void setstate(String state) {
        this.state = state;
    }
            public String getzip() {
        return zip;
    }

    public void setzip(String zip) {
        this.zip = zip;
    }
        
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
        public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }
        public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }
}
