/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condominiumproject;

import condominiumproject.model.Bill;
import condominiumproject.model.LeaveApplication;
import condominiumproject.model.Payment;
import condominiumproject.model.Supply;
import condominiumproject.model.Task;
import condominiumproject.model.Technician;
import condominiumproject.model.TechnicianBill;
import condominiumproject.model.Transaction;
import condominiumproject.model.User;
import condominiumproject.model.Worker;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Utils {
    public static final int USER_TYPE_PRESIDENT = 0;
    public static final int USER_TYPE_TREASURER = 1;
    public static final int USER_TYPE_SECRETARY = 2;
    public static final int USER_TYPE_TENANT = 3;
    public static final int USER_TYPE_CONDO_LAYER = 4;
    public static final int USER_TYPE_UNIT_OWNER = 5;
    public static final int USER_TYPE_PROPERTY_MANAGER = 6;
    public static final int USER_TYPE_TECHNICIAN = 7;
    public static User LOGGED_IN_USER;
    public static final String MY_COMMUNITY_LAYOUT= "propertymanagerreportsandrequests/property_manager_reports_and_requests_layout.fxml";
    public static final String USER_TYPE_NAMES[]={"President","Treasurer","Secretary","Tenant","Condo-Lawyer","Unit Owner","Property Manager","Technician"};
    static boolean  checkAllUsers=true;
    public static ArrayList<User> getAllUser()
    {
        setAllUser();
        ArrayList<User> userList = new ArrayList();
      
        ObjectInputStream ois=null;
         try {
             FileInputStream fis = new FileInputStream("userObjects.bin");
             ois = new ObjectInputStream(fis);             
           
            while(true){
                User u;
                u = (User) ois.readObject();//returns object
                userList.add(u);
               // break;
            }      
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }

        return  userList; 
        
        
       
        
    }
     public static void setAllUser()
    {
        ArrayList<User> userList = new ArrayList();
       
      
        ObjectInputStream ois=null;
         try {
             FileInputStream fis = new FileInputStream("userObjects.bin");
             ois = new ObjectInputStream(fis);             
           
            while(true){
                User u;
                u = (User) ois.readObject();//returns object
                userList.add(u);
               // break;
            }      
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }

       if(userList.size()>0) return ;/////
        
        User president = new User("Konoz","11-07-2000","A+","Khulna","123 456 897",111,"p111",USER_TYPE_PRESIDENT);
        ArrayList<String> pGoals= new ArrayList();
        pGoals.add("Bill");
        pGoals.add("Consulting");
        pGoals.add("Contact Board Members");
        pGoals.add("Estimated Require List");
        pGoals.add("Event Generate");
        pGoals.add("Review Report");
        pGoals.add("Review and Approve");
        pGoals.add("Approve New Budget");
        president.setGoals(pGoals);
        userList.add(president);
        //Treasurer
        ArrayList<String> trGoals= new ArrayList();
        User tr = new User("MD Konoz","11-07-2000","A+","Khulna","123 456 897",222,"tr222",USER_TYPE_TREASURER);
        userList.add(tr);
        trGoals.add("Annual Auditing");
        trGoals.add("Budget");
        trGoals.add("Check Payment");
        trGoals.add("Contact Secretary");
        trGoals.add("Income Tax Return");
        trGoals.add("Monthly Budget");
        trGoals.add("New Expense");
        trGoals.add("Send Monthly Report");
        tr.setGoals(trGoals);
        userList.add(tr);

        //PM and Tech
        User pm = new User("Rahi Bari","11-07-2000","A+","Khulna","123 456 897",123,"pm123",USER_TYPE_PROPERTY_MANAGER);
        User tech1 = new User("Mayesha","11-07-2000","A+","Khulna","123 456 897",124,"tech124",USER_TYPE_TECHNICIAN);
        tech1.setType("Technician");
        tech1.setDueAmount(5000);
        tech1.setAvailableTime("9:00am - 6:00pm");
        tech1.setUserRating("***");
        tech1.setUserTask("No");
        User tech2 = new User("Arad ","11-07-2000","A+","Khulna","123 456 897",125,"tech125",USER_TYPE_TECHNICIAN);
        User tech3 = new User("Ahan","11-07-2002","A+","Khulna","123 456 897",126,"tech126",USER_TYPE_TECHNICIAN);
        User tech4 = new User("Isham","11-07-2002","B+","Khulna","123 456 897",127,"tech127",USER_TYPE_TECHNICIAN);
        User tech5 = new User("Asif ","11-07-2009","B+","Khulna","123 456 897",128,"tech128",USER_TYPE_TECHNICIAN);
        User tech6 = new User("Luna","11-07-2008","B+","Khulna","123 456 897",129,"tech129",USER_TYPE_TECHNICIAN);
        User tech7 = new User("Zoya","11-07-2007","A-","Khulna","123 456 897",130,"tech130",USER_TYPE_TECHNICIAN);
        //setting other values
        tech2.setType("Technician");
        tech2.setDueAmount(7000);
        tech2.setAvailableTime("9:00am - 6:00pm");
        tech3.setType("Technician");
        tech3.setDueAmount(6000);
        tech3.setAvailableTime("9:00am - 6:00pm");
        tech4.setType("Technician");
        tech4.setDueAmount(3000);
        tech4.setAvailableTime("9:00am - 6:00pm");
        tech5.setType("Technician");
        tech5.setDueAmount(2600);
        tech5.setAvailableTime("9:00am - 6:00pm");
        tech6.setType("Technician");
        tech6.setDueAmount(7500);
        tech6.setAvailableTime("9:00am - 6:00pm");
        tech7.setType("Technician");
        tech7.setDueAmount(3700);
        tech7.setAvailableTime("9:00am - 6:00pm");
        
        //setting rate and status
        tech2.setUserRating("***");
        tech2.setUserTask("No");
        tech3.setUserRating("***");
        tech3.setUserTask("No");
        tech4.setUserRating("***");
        tech4.setUserTask("No");
        tech5.setUserRating("***");
        tech5.setUserTask("No");
        tech6.setUserRating("***");
        tech6.setUserTask("No");
        tech7.setUserRating("***");
        tech7.setUserTask("No");
        
        
        ArrayList<String> pmGoals= new ArrayList();
    
        pmGoals.add("Payment and Assign Tasks");
        pmGoals.add("My Community");
        pmGoals.add("Reserve Fund");
        pmGoals.add("Expense Request to Treasurer");
        pmGoals.add("Daily Reports");
        pmGoals.add("Maintainance and Update");
        pmGoals.add("Report to President ");
        pmGoals.add("Hiring Technicians");
        
        tech2.setUserRating("***");
        tech2.setUserTask("No");
        tech3.setUserRating("***");
        tech3.setUserTask("No");
        tech4.setUserRating("***");
        tech4.setUserTask("No");
        
        ArrayList<String> techGoals= new ArrayList();
        techGoals.add("My Tasks");
        techGoals.add("Request For Supply");
        techGoals.add("Emmergency");
        techGoals.add("Submit Task Bill");
        techGoals.add("Apply for due payment");
        techGoals.add("Transaction Details");
        techGoals.add("Withdrawal");
        techGoals.add("Leave Application");
        
        pm.setGoals(pmGoals);
        tech1.setGoals(techGoals);
        tech2.setGoals(techGoals);
        tech3.setGoals(techGoals);
        tech4.setGoals(techGoals);
        tech5.setGoals(techGoals);
        tech6.setGoals(techGoals);
        tech7.setGoals(techGoals);
        
        userList.add(pm);
        
        userList.add(tech1);
        userList.add(tech2);
        userList.add(tech3);
        userList.add(tech4);
        userList.add(tech5);
        userList.add(tech6);
        userList.add(tech7);
        
        //CondoLawer
        ArrayList<String> condoGoals= new ArrayList();
        User cl = new User("Toyoba","11-07-2000","A+","Khulna","123 456 897",333,"cl333",USER_TYPE_CONDO_LAYER);
        condoGoals.add("Call For meeting");
        condoGoals.add("Update Rules");
        condoGoals.add("Monetary Notice");
        condoGoals.add("Answer Queries");
        condoGoals.add("View Due Reports");
        condoGoals.add("Leave of Absence");
        condoGoals.add("Lien Notice");
        condoGoals.add("Lease Sell and transfer");
        
        cl.setGoals(condoGoals);
        userList.add(cl);
        
        //Unit Owner
        ArrayList<String> ownerGoals= new ArrayList();
        User owner = new User("Halima","11-07-2000","A+","Khulna","123 456 897",444,"ow444",USER_TYPE_UNIT_OWNER);
        ownerGoals.add("Vote");
        ownerGoals.add("Evaluate");
        ownerGoals.add("Pay Bill");
        ownerGoals.add("Registration");
        ownerGoals.add("Accident Reports");
        ownerGoals.add("Query");
        ownerGoals.add("Update To-let");
        ownerGoals.add("Request Lease");
        
        owner.setGoals(ownerGoals);
        userList.add(owner);
        
        //Secretary
         ArrayList<String> scGoals= new ArrayList();
        User secretary = new User("Sumaya","11-07-2000","A+","Khulna","123 456 897",555,"sc555",USER_TYPE_SECRETARY);
        scGoals.add("Send Report to president");
        scGoals.add("Announcement");
        scGoals.add("Generate Attendance");
        scGoals.add("Maintain Record");
        scGoals.add("Respond Query");
        scGoals.add("Send report to Condo-Lawyer");
        scGoals.add("To-do-List");
        scGoals.add("Upcoming Work");
        
        secretary.setGoals(scGoals);
        userList.add(secretary);
        //Tenant
         ArrayList<String> tenantGoals= new ArrayList();
        User tenant = new User("Sumayaa","11-07-2000","A+","Khulna","123 456 897",666,"t666",USER_TYPE_TENANT);
        tenantGoals.add("Late Payment");
        tenantGoals.add("Maintainance Request");
        tenantGoals.add("Make Reservation");
        tenantGoals.add("Move out Notice");
        tenantGoals.add("Pay Bill");
        tenantGoals.add("Registration");
        tenantGoals.add("Society Club");
        tenantGoals.add("Update Info");
        tenant.setGoals(tenantGoals);
        userList.add(tenant);
        
        
        
        try{
                FileOutputStream fos = new FileOutputStream("userObjects.bin");
                
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(User u: userList)
                {
                    oos.writeObject(u);
                    //System.out.println("Step 1");
                }
                
                oos.close();
                
                
            }
            catch(Exception e){
                System.out.println("Step 2"+e.getLocalizedMessage());
                //SHOW e.toString() IN AN ALERT
            }
        
        
        
        
        
    }
       public static void updateUser(ArrayList<User> userList)
    {
        
        try{
                FileOutputStream fos = new FileOutputStream("userObjects.bin");
                
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(User u: userList)
                {
                    oos.writeObject(u);
                    //System.out.println("Step 1");
                }
                
                oos.close();
                
                
            }
            catch(Exception e){
                System.out.println("Step 2"+e.getLocalizedMessage());
                //SHOW e.toString() IN AN ALERT
            }
        
        
        
        
        
    }
    public static void setAllWorker()
    {
         ArrayList<Worker> workerList = new ArrayList();
        Worker w1 = new Worker();
        w1.setName("Mayesha");
        w1.setType("Technician");
        w1.setAvailable_time("12pm-5pm");
        w1.setRating("***");
        w1.setAssign_task("Yes");
        w1.setCompleted_task(4);
        w1.setDueAmount(2000);
        
        Worker w2 = new Worker();
        w2.setName("Ayesha");
        w2.setType("Technician");
        w2.setAvailable_time("12pm-5pm");
        w2.setRating("*****");
        w2.setAssign_task("Yes");
        w2.setCompleted_task(8);
        w2.setDueAmount(4000);
        workerList.add(w1);
        workerList.add(w2);  
        //return workerList;
        try{
                FileOutputStream fos = new FileOutputStream("workerObjects.bin");
                
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(Worker w: workerList)
                {
                    oos.writeObject(w);
                    //System.out.println("Step 1");
                }
                
                oos.close();
                
            }
            catch(Exception e){
                //System.out.println("Step 2"+e.getLocalizedMessage());
                //SHOW e.toString() IN AN ALERT
            }
    }
     public static ArrayList getAllWorker()
    {
       
        ArrayList<Worker> workerList = new ArrayList();
        ObjectInputStream ois=null;
         try {
             
             ois = new ObjectInputStream(new FileInputStream("workerObjects.bin"));             
           
            while(true){
                Worker w;
                w = (Worker) ois.readObject();
                workerList.add(w);
               // break;
            }      
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }
       return workerList;
        
    }
     
    public static ArrayList getAllTenant()
    {
        ArrayList<Tenant> tenantList = new ArrayList();
     
        

         ObjectInputStream ois=null;
         try {
             FileInputStream fis = new FileInputStream("tenantObjects.bin");
             ois = new ObjectInputStream(fis);             
           
            while(true){
                Tenant t;
                t = (Tenant) ois.readObject();//returns object
                tenantList.add(t);
               // break;
            }      
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }

        return  tenantList; 
    }
     public static void addTenant(Tenant t){
        
        ArrayList<Tenant> tList = getAllTenant();
        tList.add(t);
        try{
                FileOutputStream fos = new FileOutputStream("tenantObjects.bin");
                
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(Tenant t1: tList)
                {
                    oos.writeObject(t1);
                    //System.out.println("Step 1");
                }
                
                oos.close();
                
                
            }
            catch(Exception e){
                //System.out.println("Step 2"+e.getLocalizedMessage());
                //SHOW e.toString() IN AN ALERT
            }
        
        
    }
    public static void addTasks(Task t){
        ArrayList<Task> taskList = getAllTasks();
        taskList.add(t);
        try{
                FileOutputStream fos = new FileOutputStream("taskObjects.bin");
                
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(Task t1: taskList)
                {
                    oos.writeObject(t1);
                    //System.out.println("Step 1");
                }
                
                oos.close();
                
                
            }
            catch(Exception e){
                //System.out.println("Step 2"+e.getLocalizedMessage());
                //SHOW e.toString() IN AN ALERT
            }
        
        
    }
    public static void updateTasks(ArrayList <Task> tasks){
        ArrayList<Task> taskList = tasks;
        try{
                FileOutputStream fos = new FileOutputStream("taskObjects.bin");
                
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(Task t1: taskList)
                {
                    oos.writeObject(t1);
                    //System.out.println("Step 1");
                }
                
                oos.close();
                
                
            }
            catch(Exception e){
                //System.out.println("Step 2"+e.getLocalizedMessage());
                //SHOW e.toString() IN AN ALERT
            }
        
        
    }
    public static ArrayList getAllTasks()
    {
        ArrayList<Task> taskList = new ArrayList();

       
        ObjectInputStream ois=null;
         try {
             
             ois = new ObjectInputStream(new FileInputStream("taskObjects.bin"));             
           
            while(true){
                Task t;
                t = (Task) ois.readObject();
                taskList.add(t);
               // break;
            }      
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }

        return  taskList;   

    }
     public static ArrayList getAllBill()
    {
        ArrayList<Bill> billList = new ArrayList();

       
        ObjectInputStream ois=null;
         try {
             
             ois = new ObjectInputStream(new FileInputStream("billObjects.bin"));             
           
            while(true){
                Bill b;
                b = (Bill) ois.readObject();
                billList.add(b);
               // break;
            }      
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }

        return  billList;   

    }
    
    
     public static void addBill(Bill b){
        ArrayList<Bill> billList = getAllBill();
        billList.add(b);
        try{
                FileOutputStream fos = new FileOutputStream("billObjects.bin");
                
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(Bill b1: billList)
                {
                    oos.writeObject(b1);
                    //System.out.println("Step 1");
                }
                
                oos.close();
                
                
            }
            catch(Exception e){
                //System.out.println("Step 2"+e.getLocalizedMessage());
                //SHOW e.toString() IN AN ALERT
            }
        
        
    } 
  public static void updateBill(ArrayList <Bill> bill){
        ArrayList<Bill> billList = bill;
        try{
                FileOutputStream fos = new FileOutputStream("billObjects.bin");
                
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(Bill b1: billList)
                {
                    oos.writeObject(b1);
                    //System.out.println("Step 1");
                }
                
                oos.close();
                
                
            }
            catch(Exception e){
                //System.out.println("Step 2"+e.getLocalizedMessage());
                //SHOW e.toString() IN AN ALERT
            }
        
        
    }
     public static ArrayList getAllApplications()
    {
        ArrayList<LeaveApplication> applicationList = new ArrayList();

       
        ObjectInputStream ois=null;
         try {
             
             ois = new ObjectInputStream(new FileInputStream("applicationObjects.bin"));             
           
            while(true){
                LeaveApplication al;
                al = (LeaveApplication) ois.readObject();
                applicationList.add(al);
               // break;
            }      
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }

        return  applicationList;   

    }
    

 public static void addApplication(LeaveApplication la){
        ArrayList<LeaveApplication> applicationList = getAllApplications();
        applicationList.add(la);
        try{
                FileOutputStream fos = new FileOutputStream("applicationObjects.bin");
                
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(LeaveApplication L: applicationList)
                {
                    oos.writeObject(L);
                    //System.out.println("Step 1");
                }
                
                oos.close();
                
                
            }
            catch(Exception e){
                //System.out.println("Step 2"+e.getLocalizedMessage());
                //SHOW e.toString() IN AN ALERT
            }
        
        
    } 

    public static void updateApplicationList(ArrayList<LeaveApplication> list){
        ArrayList<LeaveApplication> applicationList = list;
       
        try{
                FileOutputStream fos = new FileOutputStream("applicationObjects.bin");
                
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(LeaveApplication L: applicationList)
                {
                    oos.writeObject(L);
                    //System.out.println("Step 1");
                }
                
                oos.close();
                
                
            }
            catch(Exception e){
                //System.out.println("Step 2"+e.getLocalizedMessage());
                //SHOW e.toString() IN AN ALERT
            }
        
        
    } 
      public static ArrayList getAllTechnician()
    {
        ArrayList<Technician> techList = new ArrayList();
     
        

         ObjectInputStream ois=null;
         try {
             
             ois = new ObjectInputStream(new FileInputStream("technicianObjects.bin"));             
           
            while(true){
                Technician t;
                t = (Technician) ois.readObject();
                techList.add(t);
               // break;
            }      
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }

        return  techList; 
    }
     public static void addTechnician(Technician t){
        
        ArrayList<Technician> tList = getAllTechnician();
        tList.add(t);
        try{
                FileOutputStream fos = new FileOutputStream("technicianObjects.bin");
                
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(Technician t1: tList)
                {
                    oos.writeObject(t1);
                    //System.out.println("Step 1");
                }
                
                oos.close();
                
                
            }
            catch(Exception e){
                //System.out.println("Step 2"+e.getLocalizedMessage());
                //SHOW e.toString() IN AN ALERT
            }
        
        
    }
      public static void addEmmergencyTask(Task t){
        
        ArrayList<Task> tList = getAllEmmergencyTasks();
        tList.add(t);
        try{
                FileOutputStream fos = new FileOutputStream("emTaskObjects.bin");
                
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(Task t1: tList)
                {
                    oos.writeObject(t1);
                    //System.out.println("Step 1");
                }
                
                oos.close();
                
                
            }
            catch(Exception e){
                //System.out.println("Step 2"+e.getLocalizedMessage());
                //SHOW e.toString() IN AN ALERT
            }
        
        
    }
      public static ArrayList getAllEmmergencyTasks()
    {
        ArrayList<Task> tList = new ArrayList();
     
        

         ObjectInputStream ois=null;
         try {
             
             ois = new ObjectInputStream(new FileInputStream("emTaskObjects.bin"));             
           
            while(true){
                Task t;
                t = (Task) ois.readObject();
                tList.add(t);
               // break;
            }      
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }

        return  tList; 
    } 
        public static void updateEmmergencyTasks(ArrayList<Task> tList){
        ArrayList<Task> taskList = tList;
       
        try{
                FileOutputStream fos = new FileOutputStream("emTaskObjects.bin");
                
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(Task t: taskList)
                {
                    oos.writeObject(t);
                    //System.out.println("Step 1");
                }
                
                oos.close();
                
                
            }
            catch(Exception e){
                //System.out.println("Step 2"+e.getLocalizedMessage());
                //SHOW e.toString() IN AN ALERT
            }
        
        
    }    
     public static ArrayList getAllSupplyRequest()
    {
        ArrayList<Supply> supplyList = new ArrayList();

       
        ObjectInputStream ois=null;
         try {
             
             ois = new ObjectInputStream(new FileInputStream("supplyObjects.bin"));             
           
            while(true){
                Supply s;
                s = (Supply) ois.readObject();
                supplyList.add(s);
               // break;
            }      
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }

        return  supplyList;   

    }
      public static void addSpplyRequest(Supply s){
        
        ArrayList<Supply> sList = getAllSupplyRequest();
        sList.add(s);
        try{
                FileOutputStream fos = new FileOutputStream("supplyObjects.bin");
                
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(Supply s1: sList)
                {
                    oos.writeObject(s1);
                    //System.out.println("Step 1");
                }
                
                oos.close();
                
                
            }
            catch(Exception e){
                //System.out.println("Step 2"+e.getLocalizedMessage());
                //SHOW e.toString() IN AN ALERT
            }
        
        
    }
     public static void updateSupplyList(ArrayList<Supply> sList){
        ArrayList<Supply> supplyList = sList;
       
        try{
                FileOutputStream fos = new FileOutputStream("supplyObjects.bin");
                
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(Supply s: supplyList)
                {
                    oos.writeObject(s);
                    //System.out.println("Step 1");
                }
                
                oos.close();
                
                
            }
            catch(Exception e){
                //System.out.println("Step 2"+e.getLocalizedMessage());
                //SHOW e.toString() IN AN ALERT
            }
        
        
    } 
       public static ArrayList getAllPaymentRequests()
    {
        ArrayList<Payment> paymentList = new ArrayList();

       
        ObjectInputStream ois=null;
         try {
             
             ois = new ObjectInputStream(new FileInputStream("paymentObjects.bin"));             
           
            while(true){
                Payment p;
                p = (Payment) ois.readObject();
                paymentList.add(p);
               // break;
            }      
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }

        return  paymentList;
    }
    
     public static void addPaymentRequest(Payment p){
        
        ArrayList<Payment> pList = getAllPaymentRequests();
        pList.add(p);
        try{
                FileOutputStream fos = new FileOutputStream("paymentObjects.bin");
                
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(Payment p1: pList)
                {
                    oos.writeObject(p1);
                    //System.out.println("Step 1");
                }
                
                oos.close();
                
                
            }
            catch(Exception e){
                //System.out.println("Step 2"+e.getLocalizedMessage());
                //SHOW e.toString() IN AN ALERT
            }
        
        
    }
     public static void updatePaymentList(ArrayList<Payment> pList){
        ArrayList<Payment> paymentList = pList;
       
        try{
                FileOutputStream fos = new FileOutputStream("paymentObjects.bin");
                
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(Payment p: paymentList)
                {
                    oos.writeObject(p);
                    //System.out.println("Step 1");
                }
                
                oos.close();
                
                
            }
            catch(Exception e){
                //System.out.println("Step 2"+e.getLocalizedMessage());
                //SHOW e.toString() IN AN ALERT
            }
        
        
    }  
       public static ArrayList getAllTechBill()
    {
        ArrayList<TechnicianBill> techBillList = new ArrayList();

       
        ObjectInputStream ois=null;
         try {
             
             ois = new ObjectInputStream(new FileInputStream("techbillObjects.bin"));             
           
            while(true){
                TechnicianBill t;
                t = (TechnicianBill) ois.readObject();
                techBillList.add(t);
               // break;
            }      
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }

        return  techBillList;
    }
      public static void addTechBill(TechnicianBill b){
        ArrayList<TechnicianBill> TechBillList = getAllTechBill();
        TechBillList.add(b);
        try{
                FileOutputStream fos = new FileOutputStream("techbillObjects.bin");//accessing file
                
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(TechnicianBill b1: TechBillList)
                {
                    oos.writeObject(b1);
                    //System.out.println("Step 1");
                }
                
                oos.close();
                
                
            }
            catch(Exception e){
                //System.out.println("Step 2"+e.getLocalizedMessage());
                //SHOW e.toString() IN AN ALERT
            }
        
        
    } 
       public static void addTransaction(Transaction t){
        ArrayList<Transaction> tList = getAllTransactions();
        tList.add(t);
        try{
                FileOutputStream fos = new FileOutputStream("transactionObjects.bin");
                
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                for(Transaction t1: tList)
                {
                    oos.writeObject(t1);
                    //System.out.println("Step 1");
                }
                
                oos.close();
                
                
            }
            catch(Exception e){
                //System.out.println("Step 2"+e.getLocalizedMessage());
                //SHOW e.toString() IN AN ALERT
            }
        
        
    }
    public static ArrayList getAllTransactions()
    {
        ArrayList<Transaction> tList = new ArrayList();

       
        ObjectInputStream ois=null;
         try {
             
             ois = new ObjectInputStream(new FileInputStream("transactionObjects.bin"));             
           
            while(true){
                Transaction t;
                t = (Transaction) ois.readObject();
                tList.add(t);
               // break;
            }      
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex1) {  }           
        }

        return  tList;
    }
}
