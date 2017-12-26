/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

import java.util.Scanner;

/**
 *
 * @author daisysun
 */
public class Triangle {

    private int sideA;
    private int sideB;
    private int sideC;

    ////Create triangle object
//print values for triangle
    //  System.out.print ("Read in a new triangle?(-1 for no, 1 for yes): ");
    //if(input.nextInt() < 0) break;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        while (true) {
            System.out.print("Enter the length of side A: ");  //Prompt user for side a
            int A = input.nextInt();
            System.out.print("Enter the length of side B: ");//Prompt user for side b
            int B = input.nextInt();
            System.out.print("Enter the length of side C: ");//Prompt user for side c
            int C = input.nextInt();
            
            //Create triangle object
            Triangle x = new Triangle (A,B,C);
            System.out.println("Valid Triangle:         " + x.isValid());
            System.out.println("Right Triangle:         " + x.isRight());
            System.out.println("Scalene Triangle:       " + x.isScalene());
            System.out.println("Isosceles Triangle:     " + x.isIsosceles());
            System.out.println("Equilateral Triangle:   " + x.isEquilateral());
            //print values for triangle
            System.out.print("Read in a new triangle?(-1 for no, 1 for yes ): ");
            if (input.nextInt() < 0) {
                break; //breaks if userinput less that 0
            }
        }
    }

    //getters
    public int getsideA() { //get side A
        return sideA;
    }

    public int getsideB() { //get side b
        return sideB;
    }

    public int getsideC() {//get side c
        return sideC;
    }

    //setters     
    public void setsideA(int A) { //setter for A
        sideA = A;
    }

    public void setsideB(int B) { //setter for side B
        sideB = B;
    }

    public void setsideC(int C) { //setter for sideB
        sideC = C;
    }

    Triangle() {
    } //default constructor 
    
    
    //constuctor
     Triangle(int aye, int bee, int sea) { 
        sideA = aye;
        sideB = bee;
        sideC = sea;
    }

    public boolean isValid() { //triangle inequality theorem 
        //a + b > c or
        //b + c > a or
        //a + c > b
        if (((sideA + sideB) > sideC) && ((sideB + sideC) > sideA) && (sideA + sideC) > sideB) {
            return true;
        }else {
            return false;
        }
    }

    public boolean isScalene() { //all unequal sides
        if ((sideA != sideB) && (sideB != sideC) && (sideC != sideA)) {
            //all sides dont equal
            return true;
        } else {
            return false;
        }
    }

    public boolean isIsosceles() { //two equal sides
        if ((sideA == sideB) || (sideB == sideC) || (sideC == sideA)) {
            return true;
        } else {
            return false;
        }
    }
    /*  public boolean isRight()
     // A right triangle satisfies the Pythagorean theorem.
     // An isosceles triangle has TWO equal sides.
     public boolean isIsosceles()
     // An equilateral triangle has all equal sides.
     public boolean isEquilateral() */

    public boolean isRight() { //a2 + b2 = c2
        if (((sideA * sideA) + (sideB * sideB) == (sideC * sideC)) //a2 + b2 = c2
                || ((sideC * sideC) + (sideA * sideA) == (sideB * sideB))//c2+a2=b2
                || ((sideB * sideB)+ (sideC * sideC) == (sideA * sideA))){ //b2+c2=a2
            return true;
        }else{
            return false;
        }
    }

    public boolean isEquilateral() { //ALL sides equal
        if ((sideA == sideB) && (sideB == sideC) && (sideC == sideA)) {
            return true;
        } else {
            return false;
        }

    }

}
