package Homework5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        isStringPalindrome();
    }
    private static void isStringPalindrome() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Examples for Palindromes: madam, kayak, rotor, level, radar, refer");
        System.out.println("Please enter a string to test it! ");

        String userInput = myScanner.nextLine();
        String userInputReverse = "";

        for ( int i = userInput.length() - 1; i >= 0; i-- ) {
            userInputReverse = userInputReverse + userInput.charAt(i);
        }

        if (userInput.equals(userInputReverse)) {
                System.out.println("Entered string is a palindrome.");
        } else {
                System.out.println("Entered string is NOT a palindrome.");
        }

    }
}
