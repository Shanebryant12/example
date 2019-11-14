/** This is a simple Java Program
   FileName : "COSC220_Shane_Bryant_SumofIntegers".
   Author: Shane Bryant
   Date: 10/22/2019
   Purpose: This is a simple java program that lets the user enter a positive nonzero integer and gets the total sum from 1 to the number entered*/

import java.util.Scanner;
public class COSC220_Shane_Bryant_SumofIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repeat;
        int n;
        int sum = 0;
        do{
//Asks the user to enter a number (nonzero & positive integer)        
        System.out.println("Please enter a positive non-zero integer");
        n = scanner.nextInt();
//Input Validation (checks if the number is less than 1, if so it makes the user enter         
        while( n < 1) {
          System.out.println("Please enter a positive non-zero integer");
          n = scanner.nextInt();
        }
//For loop used to allow increment(Adds the first number to the previous number, until number reaches the integer inputted)        
        for( int i = 1; i <= n; i++) {
            sum = 0;
            sum = sum + i;
        }
        System.out.println("The sum of numbers from integer value 1 to "+ n + " is " + sum);
        System.out.println("Do you want to calculate another sum? Yes or No");
        repeat = scanner.next();
      
     } while (repeat.equalsIgnoreCase("Yes"));
//Part of the do-wile loop (Allows user to repeat the program)     
      if (repeat != ("Yes")) {
      System.out.println("Thank you for using the program!");
      }
   }
} 
       