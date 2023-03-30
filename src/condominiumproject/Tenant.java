/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominiumproject;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class Tenant implements Serializable {
    private long id;
    private String name;
    private String address;
    private int numOfMembers;
    private String flatNumber;
    private LocalDate date;
    private String requestDescription;

    public String getRequestDescription() {
        return requestDescription;
    }

    public void setRequestDescription(String requestDescription) {
        this.requestDescription = requestDescription;
    }
    
    
    public Tenant()
    {
        
    }

    public Tenant(long id, String name, String address, int numOfMembers, String flatNumber,LocalDate date) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.numOfMembers = numOfMembers;
        this.flatNumber = flatNumber;
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumOfMembers() {
        return numOfMembers;
    }

    public void setNumOfMembers(int numOfMembers) {
        this.numOfMembers = numOfMembers;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }
    
    
    
    
    
}
