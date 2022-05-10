package Homework7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideNumbers {


    // int userInputPercentage = myScanner.nextInt();
    public static void main(String[] args) {
        int a;
        int b;

        Scanner myScanner = new Scanner(System.in);

        try {
            System.out.println("Please enter number a:");
            a = myScanner.nextInt();
            System.out.println("Please enter number b:");
            b = myScanner.nextInt();
            int c = a / b;
        } catch (InputMismatchException e) {
            System.out.println(e);
        } catch (ArithmeticException e2) {
            System.out.println("You can’t divide by zero!!!");
        }
    }
}
