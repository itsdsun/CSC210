/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsmethods;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author daisysun
 */
public class RPSMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        displayOpeningMessage(); //calls displayOpeningMessage 

        Scanner in = new Scanner(System.in); 
        
        int user = getUserMove(in); //stores int called from getUserMove into variable user 
        int comp = getCPUMove(); //stores int called from CPU into variable comp

        determineWinner(user, comp); //determines winner with int user and comp

    }

    public static void displayOpeningMessage() {
        System.out.println("This program will play a game of Rock-Paper-Scissors. ");
        System.out.println("For this program 0 will scissors, 1 will be rock, and 2 will be paper.");

    }

    public static int getUserMove(Scanner in) {
        //user input 
        System.out.print("Enter move: [scissors (0), rock (1), paper (2)] : "); //prompts the user for a move
        int userinput = in.nextInt();
        while (userinput != 0 && userinput != 1 && userinput != 2) //checks the userinput in a while loop
        {
            System.out.print("Enter move: [scissors (0), rock (1), paper (2)] : ");
            userinput = in.nextInt();
        }
        return userinput;
    }

    public static int getCPUMove() {
        Random rnd = new Random(); //Declares and initializes a Random Object
        int comp = rnd.nextInt(3); //Generates a number between 0 and 2
        return comp;
    }

    public static void determineWinner(int user, int comp) {

        //0 = scissors
        //1 = rock
        //2 = paper
        //if user = comp, then it's a tie.    
        if (user == comp) {

            if (user == 0) {
                System.out.println("The computer is scissor. You are scissor too. Game is a draw.");
            } else if (user == 1) {
                System.out.println("The computer is rock. You are rock too. Game is a draw.");
            } else {
                System.out.println("The computer is paper. You are paper too. Game is a draw.");
            }
            //Exit program
            System.exit(0);
        }
        //user chooses scissor 0
        if (user == 0) {
            if (comp == 1) {
                System.out.println("The computer is rock. You are scissor. You lose.");
            } else {
                System.out.println("The computer is paper. You are scissor. You win!");
            }
        } //user chooses rock 1
        else if (user == 1) {
            if (comp == 0) {
                System.out.println("The computer is scissor. You are rock. You win!");
            } else {
                System.out.println("The computer is paper. You are rock. You lose.");
            }

        } //user chooses paper 2
        else {
            if (comp == 0) {
                System.out.println("The computer is scissor. You are paper. You lose.");
            } else {
                System.out.println("The computer is rock. You are paper. You win!");
            }
        }
    }

}
