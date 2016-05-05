package TOBA.Business;

import java.io.Serializable;

public class User implements Serializable {

    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String address2;
    private String city;
    private String st;
    private String zip;
    private String email;
    private String username;
    private String password;
    private String npassword;

    public User() {
        firstName = "";
        lastName = "";
        phone = "";
        address = "";
        address2 = "";
        city = "";
        st = "";
        email = "";
        username = "";
        password = "";
        npassword = "";
    }

    public User(String firstName, String lastName, String phone, String address, 
            String address2, String city, String st, String zip, String email, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.address2 = address2;
        this.city = city;
        this.st = st;
        this.zip = zip; 
        this.email = email;
        this.username = username;
        this.password = password;
    }
    
     public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
     
    public User(String username, String password, String npassword) {
        this.username = username;
        this.password = password;
        this.npassword = npassword;
    } 

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
        
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
            public String getst() {
        return st;
    }

    public void setst(String st) {
        this.st= st;
    }
            public String getzip() {
        return zip;
    }

    public void setzip(String zip) {
        this.zip = zip;
    }
        
    public String getemail() {
        return email;
    }

    public void setemail(String email) {
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
        this.password = password;}


}