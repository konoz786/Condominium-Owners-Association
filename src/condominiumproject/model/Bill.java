/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominiumproject.model;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Bill implements Serializable {
    private long id;
    private String name;
    private String flatNum;
    private int payable;
    private String month;
    private int due;
    private int paid;
    private String billName;
    private String status;
 
    public Bill(){
        
    }

   
    
    

    public Bill(String name, String flatNum, int payable) {
        this.name = name;
        this.flatNum = flatNum;
        this.payable = payable;
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

    public String getFlatNum() {
        return flatNum;
    }

    public void setFlatNum(String flatNum) {
        this.flatNum = flatNum;
    }

    public int getPayable() {
        return payable;
    }

    public void setPayable(int payable) {
        this.payable = payable;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDue() {
        return due;
    }

    public void setDue(int due) {
        this.due = due;
    }

    public int getPaid() {
        return paid;
    }

    public void setPaid(int paid) {
        this.paid = paid;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public String getStatus() {
        if(paid>=payable)
        {
            status = "Paid";
        }
        else status = "Unpaid";
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

 
    
    
  
    
}
