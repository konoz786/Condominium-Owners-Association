/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominiumproject.model;

import java.io.Serializable;
import java.util.ArrayList;


public class User extends Person implements Serializable {
    private String userName;
    private String userTask;
    private String userRating;
    private String workStatus;
    private String workDeadline;
    private String workAssignedBy;
     private String type;
    private String availableTime;
    private int dueAmount;
    
    
    
    private int userId;
    private String password;
    private int userTypeId;
    private ArrayList<String> goals;
    
    public User(){
        
    }

    public User(String name,String dob,String bloodGroup,String address,String NID,int userId, String password, int userTypeId) {
      super(name,dob,bloodGroup,address,NID);
        
        this.userId = userId;
        this.password = password;
        this.userTypeId = userTypeId;
        this.userName = name;
        
    }
    
    

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    public ArrayList<String> getGoals() {
        return goals;
    }

    public void setGoals(ArrayList<String> goals) {
        this.goals = goals;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTask() {
        return userTask;
    }

    public void setUserTask(String userType) {
        this.userTask = userType;
    }

    public String getUserRating() {
        return userRating;
    }

    public void setUserRating(String userRating) {
        this.userRating = userRating;
    }

    public String getWorkStatus() {
        if (workStatus==null)
        {
            workStatus = "";
        }
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    public String getWorkDeadline() {
        return workDeadline;
    }

    public void setWorkDeadline(String workDeadline) {
        this.workDeadline = workDeadline;
    }

    public String getWorkAssignedBy() {
        return workAssignedBy;
    }

    public void setWorkAssignedBy(String workAssignedBy) {
        this.workAssignedBy = workAssignedBy;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(String availableTime) {
        this.availableTime = availableTime;
    }

    public int getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(int dueAmount) {
        this.dueAmount = dueAmount;
    }
    
    
    
}
