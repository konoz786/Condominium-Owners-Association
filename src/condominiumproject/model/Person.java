/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominiumproject.model;

import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class Person {
    private String name;
    private String dob;
    private String bloodGroup;
    private String address;
    private String NID;

    public Person(String name, String dob, String bloodGroup, String address, String NID) {
        this.name = name;
        this.dob = dob;
        this.bloodGroup = bloodGroup;
        this.address = address;
        this.NID = NID;
    }
    
    public Person(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNID() {
        return NID;
    }

    public void setNID(String NID) {
        this.NID = NID;
    }
    
    
    
    
    
    
}
