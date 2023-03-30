
package oopproject2022.Tenant;

import java.time.LocalDate;


public class Tenant {
    
    private String name,flatNumber;
    private LocalDate dob;
    private int teanantId;
    
    public Tenant(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getTeanantId() {
        return teanantId;
    }

    public void setTeanantId(int teanantId) {
        this.teanantId = teanantId;
    }
    
}
