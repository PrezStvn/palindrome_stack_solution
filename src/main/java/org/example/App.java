package org.example;
import org.example.module.PalindromeTester;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);
        while(true) {
            System.out.println("input a word you think is a palindrome if you would like to exit enter q or Q");
            String test = scnr.nextLine();
            if(test.equalsIgnoreCase("q")) break;
            if (PalindromeTester.isPalindrome(test)) {
                System.out.println("True: " + test + " is a palindrome");
            } else {
                System.out.println("False:  unfortunately " + test + " is not a palindrome");
            }
        }
        System.out.println("Cheers mate, thanks for stopping by.");
    }

}
