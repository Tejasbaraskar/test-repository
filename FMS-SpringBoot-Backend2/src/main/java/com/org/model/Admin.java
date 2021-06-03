package com.org.model;

 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

 

@Entity
public class Admin {

 

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int adminId;
    private String name;
    private long phone;
    private String email;
    private String city;
    private String state;
    private String gender;
    private String username;
    private String password;
    private String confirmPassword;
    
    
    public Admin() {
        super();
    }

 


    public Admin(int adminId, String name, long phone, String email, String city, String state, String gender,
            String username, String password, String confirmPassword) {
        super();
        this.adminId = adminId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.city = city;
        this.state = state;
        this.gender = gender;
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

 


    public int getAdminId() {
        return adminId;
    }

 


    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

 


    public String getName() {
        return name;
    }

 


    public void setName(String name) {
        this.name = name;
    }

 


    public long getPhone() {
        return phone;
    }

 


    public void setPhone(long phone) {
        this.phone = phone;
    }

 


    public String getEmail() {
        return email;
    }

 


    public void setEmail(String email) {
        this.email = email;
    }

 


    public String getCity() {
        return city;
    }

 


    public void setCity(String city) {
        this.city = city;
    }

 


    public String getState() {
        return state;
    }

 


    public void setState(String state) {
        this.state = state;
    }

 


    public String getGender() {
        return gender;
    }

 


    public void setGender(String gender) {
        this.gender = gender;
    }

 


    public String getUsername() {
        return username;
    }

 


    public void setUsername(String username) {
        this.username = username;
    }

 


    public String getPassword() {
        return password;
    }

 


    public void setPassword(String password) {
        this.password = password;
    }

 


    public String getConfirmPassword() {
        return confirmPassword;
    }

 


    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

 


    @Override
    public String toString() {
        return "Admin [adminId=" + adminId + ", name=" + name + ", phone=" + phone + ", email=" + email + ", city="
                + city + ", state=" + state + ", gender=" + gender + ", username=" + username + ", password=" + password
                + ", confirmPassword=" + confirmPassword + "]";
    }
    
    
}