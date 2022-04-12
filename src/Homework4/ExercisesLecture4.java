package Homework4;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ExercisesLecture4 {
    private static int dayOfTheWeekNumber;
    private static String[] stringArrayDaySuffix = new String[]{"st", "nd", "rd", "th"};
    private static String[] stringArrayDays = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static void main(String[] args) {
        // checkDay();
        // checkAge();
        // calculateRevenue();
        // findLargestNumber();
        // adviceTheUser();
        // checkArray();
        // reverseArray();
}
    // EXERCISE 1 with If statement
    private  static void checkDay(){
        System.out.println("Please enter day of the week: ");
        Scanner myScanner = new Scanner(System.in);
        dayOfTheWeekNumber = myScanner.nextInt();
        if (dayOfTheWeekNumber == 1){
            printDayOfTheWeek();
        } else if (dayOfTheWeekNumber == 2) {
            printDayOfTheWeek();
        } else if (dayOfTheWeekNumber == 3) {
            printDayOfTheWeek();
        } else if (dayOfTheWeekNumber <= 4 && dayOfTheWeekNumber <= 7 && dayOfTheWeekNumber > 0 ) {
            printDayOfTheWeek();
        } else {
            System.out.println("That is not a valid day");
        }
    }
    private static void printDayOfTheWeek() {
        System.out.println("The "
                + dayOfTheWeekNumber
                + stringArrayDaySuffix[dayOfTheWeekNumber-1]
                + " day of the week is: "
                + stringArrayDays[dayOfTheWeekNumber-1]);
    }
    //===========================
    // EXERCISE 2
    private static void checkAge() {
        System.out.println("Please enter age ");
        Scanner myScanner = new Scanner(System.in);
        int myAge = myScanner.nextInt();
        if (myAge>=16){
            System.out.println("You are eligible to work");
        }else if (myAge < 0 || myAge > 100){
            System.out.println("You are NOT a human");
        }else {
            System.out.println("You are NOT eligible to work");
        }
    }
    //===========================
    // EXERCISE 3
    private static void calculateRevenue() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter price:");
        int unitPrice = myScanner.nextInt();

        System.out.println("Please enter quantity:");
        int unitQuantity = myScanner.nextInt();
        double discountPercentage;
        if (unitQuantity > 120){
            discountPercentage = 20;
            double revenue = unitPrice * unitQuantity;
            double discount = (revenue*discountPercentage) /100;
            double revenueAfterDiscount = revenue - discount;
        System.out.println("The revenue from sale: " + revenueAfterDiscount + "$");
        System.out.println("Discount: " + discount + "$" + "(" + discountPercentage+ "%" + ")");
        }else if (unitQuantity <= 120 && unitQuantity >= 100){
            discountPercentage = 15;
            double revenue = unitPrice * unitQuantity;
            double discount = (revenue*discountPercentage) /100;
            double revenueAfterDiscount = revenue - discount;
            System.out.println("The revenue from sale: " + revenueAfterDiscount + "$");
            System.out.println("Discount: " + discount + "$" + "(" + discountPercentage+ "%" + ")");
        }else {
            System.out.println("Please enter valid values");
        }
    }
    //===========================
    // EXERCISE 4
    public static void findLargestNumber() {
        System.out.println("Please enter five different numbers");
        Scanner myScanner = new Scanner(System.in);
        int[] numbers = new int[5];
        // loop for creating the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter number");
            numbers[i] = myScanner.nextInt();
        }
        // loop to check the largest number
        int largestNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > largestNumber) {
                    largestNumber = numbers[i];
                }
            }
        System.out.println("Largest number is: " + largestNumber);
        }
        //===========================
        // EXERCISE 5
        private static void adviceTheUser() {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Please enter Mountain or Beach: ");
            String place = myScanner.nextLine();
            String placeLowerCase = place.toLowerCase(Locale.ROOT);

            System.out.println("Please enter budget: ");
            int budget = myScanner.nextInt();

            if (placeLowerCase.equals("mountain") || placeLowerCase.equals("beach") ) {
                if(budget <= 50 && placeLowerCase.equals("mountain")){
                    System.out.println("Suggested destination for you is: Bulgaria");
                } else if(budget >= 50 && placeLowerCase.equals("mountain")){
                    System.out.println("Suggested destination for you is: Outside Bulgaria");
                } else if(budget <= 30 && placeLowerCase.equals("beach")){
                System.out.println("Suggested destination for you is: Bulgaria");
                } else if(budget >= 30 && placeLowerCase.equals("beach")){
                    System.out.println("Suggested destination for you is: Outside Bulgaria");
                } else {
                    System.out.println("We don't have information about this destination");
                }
            }
    }
            //===========================
            // EXERCISE 6
            private static void checkArray() {
                int[] list1 = new int[] {12,15,32,42,55,75,122,132,150,180,200};
                int i = 0;

                while (list1[i] < 150) {
                    int testNumber = list1[i]%5;
                    if (testNumber == 0 ){
                        System.out.println(list1[i]);
                    }
                    i++;
                }
    }
    //===========================
    // EXERCISE 6
    private static void reverseArray() {
        int[] list1 = new int[] {10, 20, 30, 40, 50};
        System.out.println("Array before reverse: " + Arrays.toString(list1) );
        int[] revertedList;
        for(int i=0; i<list1.length/2; i++){
            int temp = list1[i];
            list1[i] = list1[list1.length -i -1];
            list1[list1.length -i -1] = temp;
        }
        System.out.println("Array after reverse: " + Arrays.toString(list1) );
    }
}

