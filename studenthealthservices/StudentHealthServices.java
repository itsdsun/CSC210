/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenthealthservices;

/**
 *
 * @author daisysun
 */

public class StudentHealthServices {
    
     public static void main(String[] args) {
         System.out.println("Number of patients: " + EMR.patientobj); //prints # of patient objs = 0
         //patient objects (5) 
         EMR p1 = new EMR ("Dipper","5/1/2016", "Can't talk or walk", 99.000, 78.005, "Recently born", "Baby vitamins");
         EMR p2 = new EMR ("John", "1/7/1950");
         EMR p3 = new EMR("Naruto", "10/11/1980","Chest pains", 97.6,80.0,"Heartbreak","Heart medication");
         EMR p4 = new EMR("Bruce", "12/18/1969","Green skin, abnormal body size",103.00, 89.00, "Gamma radiation","Tylenol");
         EMR p5 = new EMR();
         //prints number of patients after counting patient objs
         System.out.println("Number of patients: " + EMR.patientobj);
         display(p1, p2, p3, p4, p5); //calls method
     }
     
      public static void display(EMR p1, EMR p2, EMR p3, EMR p4, EMR p5) { //method to print patients + info
          //patient 1
        System.out.println("                   "); //empty space for aesthetic purposes
        System.out.println("*****Patient 1 ****");
        System.out.println("                   "); //empty space
        System.out.println("Name                  : " + (p1.getName())); //gets name from patient 1 (p1)
        System.out.println("DOB                   : " + (p1.getDoB()));  
        System.out.println("Reason for Visit      : " + (p1.getReason()));
        System.out.println("Body Temp             : " + (p1.getTemp()));
        System.out.println("Heart Rate            : " + (p1.getHeartrate()));
        System.out.println("Diagnosis             : " + (p1.getDiagnosed()));
        System.out.println("Prescribed Medicine   : " + (p1.getMeds()));
        
        //patient 2
        System.out.println("                   ");
        System.out.println("*****Patient 2 ****");
        System.out.println("                   ");
        System.out.println("Name                  : " + (p3.getName()));
        System.out.println("DOB                   : " + (p3.getDoB()));
        System.out.println("Reason for Visit      : " + (p3.getReason()));
        System.out.println("Body Temp             : " + (p3.getTemp()));
        System.out.println("Heart Rate            : " + (p3.getHeartrate()));
        System.out.println("Diagnosis             : " + (p3.getDiagnosed()));
        System.out.println("Prescribed Medicine   : " + (p3.getMeds()));
        
        //patient 3
        System.out.println("                   ");
        System.out.println("*****Patient 3 ****");
        System.out.println("                   ");
        System.out.println("Name                  : " + (p4.getName()));
        System.out.println("DOB                   : " + (p4.getDoB()));
        System.out.println("Reason for Visit      : " + (p4.getReason()));
        System.out.println("Body Temp             : " + (p4.getTemp()));
        System.out.println("Heart Rate            : " + (p4.getHeartrate()));
        System.out.println("Diagnosis             : " + (p4.getDiagnosed()));
        System.out.println("Prescribed Medicine   : " + (p4.getMeds()));

        
    }
     
}