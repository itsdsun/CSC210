/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccvalidator;

import java.util.Scanner;

/**
 *
 * @author daisysun
 */
public class CCValidator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        long n = getCardNumber(in); //store card # into variable n
        long s = sumOfDoubleEvenPlace(n); //variable to store sumofdbleevenplace
        long sum = sumOfOddPlace(n);//variable to store oddsum
        long heya = sumofOddandEvenSums(s, sum);//variable to store sum of both sums
        validOrInvalid(heya, n);
    }

    public static long getCardNumber(Scanner in) {
        //user input 
        System.out.print("Please enter a Credit Card number : "); //prompts the user for a card #
        long userinput = in.nextLong();
        return userinput;
    }


    public static long sumOfDoubleEvenPlace(long n) {
//long n = getCardNumber(in); //store card # into variable n
        int count = 0; //variable to count each number
        long r = 0; // variable r is the second #s from the right
        long s = 0;
        long na = 0; // variable na is the doubled number
        //long arra = 0;

        while (n > 0) {
            r = n % 10; // card number % 10
            n /= 10; // card number / 10
            count++; //counts each time it does that
            if (count % 2 == 0) { //even place
                long ra = 0; //variable to store second digit of a two digit number
                long ar = 0;//variable to store first digit of a two digit number
                long arra = 0;//variable of the sum of the two digits
                na = r * 2; //doubles r and stores into variable na
                if (na > 9) //if na is a two digit number
                {
                    ra = na % 10; //na module 10 store into ra - gets second digit
                    ar = na / 10; // na divided by 10 stores into ar - gets first digit
                    arra = ar + ra; //adds the two digits together  
                    s = s + arra; //sum

                } else {
                    s = s + na; //sum
                }
            }
        }
        return s;
    }

    public static long sumOfOddPlace(long n) {
        int count = 0; //variable to count each number
        long r = 0; // variable r is the odd #s from the right
        long sum = 0; //variable for sum of odd numbers

        while (n > 0) {
            r = n % 10; // card number % 10
            n /= 10; // card number / 10 
            count++; //counts each time it does that
            if (count % 2 == 1) { //if the count is odd
                sum += r; //sum + r = sum
                r++;
            }
        }
        return sum;
    }
    
    public static long sumofOddandEvenSums(long s, long sum) {
        long heya = 0; //variable to hold sum of sums
        heya = s + sum; //sum + other sum (s)
        return heya; 
    }
    
    public static void validOrInvalid(long heya, long n) {
        long ugh = 0;//variable to hold heya/10
        ugh = heya / 10; //heya (sum + s) / 10
        if (heya % 10 == 0) { //if divisible - valid
            System.out.println("The CC Number: " + n + " is valid.");
        } else {//if not - invalid
            System.out.println("The CC Number: " + n + " is invalid.");
        }
    }
}
