/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalculator;

import java.util.Scanner;

/**
 *
 * @author daisysun
 */
public class BMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Name
         Scanner input = new Scanner(System.in);
         int result; 
         System.out.print("Name: ");
        String name = input.next();
        
        //Weight
         Scanner weight = new Scanner(System.in);
         System.out.print("Weight(lb): "); 
         double w = weight.nextInt();
         
        //Height
         Scanner height = new Scanner(System.in);
         System.out.print("Height(in): ");
         int h = height.nextInt();
         
         //Calculate BMI 
         double BMI = 0;
         BMI = ((w/(h*h))*703);
         
         //BMI Classification - if else statement
         if (BMI <= 18.5){
             System.out.println("BMI: Underweight");   
             System.out.println(BMI);
        }
         
         else if (BMI <= 24.9){ 
            System.out.println("BMI: Normal Weight");  
        }
         else if (BMI <= 29.9){
             System.out.println("BMI: Overweight");
        }
         else if (BMI >=30 ){
             System.out.println("BMI: Obesity");
        }
    }
}

    
        
         
         
        
        
        
        
        
        
        
        
       
         
       
