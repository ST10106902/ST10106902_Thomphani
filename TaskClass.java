/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

public class TaskClass {
    private String taskName=null;
    private int taskNumber=0;
    private String taskDesc=null;
    private String devDetails=null;
    private double taskDuration=0;
    private String taskID=null;
    private String taksStatus=null;
    

    public TaskClass(String taskName, int taskNumber, String taskDesc, String devDetails, double taskDuration, String taskID, String taksStatus) {
        this.taskName = taskName;
        this.taskNumber = taskNumber;
        this.taskDesc = taskDesc;
        this.devDetails = devDetails;
        this.taskDuration = taskDuration;
        this.taskID = taskID;
        this.taksStatus = taksStatus;
    }

    TaskClass(String taskName,int i,String taskdescr, String devDetail,double time,String taskStatus) {
        this.taskName = taskName;
        this.taskNumber = i;
        this.taskDesc = taskdescr;
        this.devDetails = devDetail;
        this.taskDuration = time;
        this.taksStatus = taskStatus;
    }

    TaskClass(String string, String chsecke99, String thompho, String netshi) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    TaskClass(String tasK_Description_should_not_be_more_than_) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean checkTaskDescription(){
        boolean isGreater=false;
        
        if(taskDesc.length()>50){
            isGreater=true;
        }
        return isGreater;
    }
    
    private String createTaskID(){
        
      this.taskID=(this.taskName.substring(1,2)+":"+this.taskNumber+":"+this.devDetails.substring(this.devDetails.length() -3)).toUpperCase();

      return taskID;
    }
     
    public String printTaskDetails(){
        String taskDetails=" ";
        
        taskDetails="Task Status: "+this.taksStatus+
                "\n Developer Details "+this.devDetails+
                "\n Task Number: "+this.taskNumber+
                "\n Task Name: "+this.taskName+
                "\n Task Description: "+this.taskDesc+
                "\n Task ID: "+createTaskID()+
                "\n Durtion: "+this.taskDuration;
        return taskDetails;
    }
    
    public int returnTotalHours(){
        int totalHours=0;
        
        totalHours+=(int)this.taskDuration;
        
        return totalHours;
        
    }
    
}
