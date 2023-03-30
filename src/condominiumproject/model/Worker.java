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
public class Worker implements Serializable{
    private String name;
    private String type;
    private String available_time;
    private String rating;
    private String assign_task;
    private int completed_task;
    private int dueAmount;

    public int getCompleted_task() {
        return completed_task;
    }

    public void setCompleted_task(int completed_task) {
        this.completed_task = completed_task;
    }

    public int getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(int dueAmount) {
        this.dueAmount = dueAmount;
    }
     
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAvailable_time() {
        return available_time;
    }

    public void setAvailable_time(String available_time) {
        this.available_time = available_time;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getAssign_task() {
        return assign_task;
    }

    public void setAssign_task(String assign_task) {
        this.assign_task = assign_task;
    }
    
    
    
}
