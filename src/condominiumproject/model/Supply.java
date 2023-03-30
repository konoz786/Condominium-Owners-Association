/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominiumproject.model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class Supply implements Serializable {
    private long id;
    private String taskName;
    private int supplyAmount;
    private String purpose;
    private LocalDate requiredDate;
    private String Status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getSupplyAmount() {
        return supplyAmount;
    }

    public void setSupplyAmount(int supplyAmount) {
        this.supplyAmount = supplyAmount;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public LocalDate getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(LocalDate requiredDate) {
        this.requiredDate = requiredDate;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
    
    
    
}
