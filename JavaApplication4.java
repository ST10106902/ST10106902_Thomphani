/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;
import java.util.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author COMPUTER
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"Welcome to Easy Kanban");
        
        JOptionPane.showInputDialog(null,"Please select an option\n"
                + "1.Add tasks\n"
                + "2.Show report\n"
                + "3. Quit\n");
        
      int howManyTime= Integer.parseInt(JOptionPane.showInputDialog("Enter How many taks you want to add"));
      
     for(int i=0;i<=howManyTime;i++){
      
         String taskName=JOptionPane.showInputDialog("Enter task name");
       
         String taskDesc=JOptionPane.showInputDialog("Enter task desc");
      
         String devDetails=JOptionPane.showInputDialog("Enter details");
         double taskDuration=Double.parseDouble(JOptionPane.showInputDialog("Enter duration"));
     
        String taksStatus=JOptionPane.showInputDialog("Enter Status");
        
        TaskClass task=new TaskClass(taskName,i+1,taskDesc,devDetails,taskDuration,taksStatus);
            JOptionPane.showMessageDialog(null, task.printTaskDetails());
          //  System.out.println(task.printTaskDetails());
     
     }
        
        
        
    }

    JavaApplication4(String login_Feature) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
