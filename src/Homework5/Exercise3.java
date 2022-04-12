package Homework5;

import java.util.Scanner;

import static Homework5.Exercise2.printValuesOf2dArrayForEach;

public class Exercise3 {
    public static void main(String[] args) {
        createAndPrint2dArray();
    }
    private static void createAndPrint2dArray() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter number of rows:");
        int arrayRows = myScanner.nextInt();
        System.out.println("Please enter number of columns:");
        int arrayColumns = myScanner.nextInt();

        int[][] userArray = new int[arrayRows][arrayColumns];
        // loop for creating the array
        for (int i = 0; i < arrayRows; i++) {
            for (int j = 0; j < arrayColumns; j++) {
                System.out.println("Please enter a number");
                userArray[i][j] = myScanner.nextInt();
            }
        }
        // call method to print the  created array
        printValuesOf2dArrayForEach(userArray);
    }

}
