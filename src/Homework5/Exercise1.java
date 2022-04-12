package Homework5;

public class Exercise1 {
    private static int sum = 0;


    public static void main(String[] args) {
        int[] arr = new int[] {12,15,32,42,55,75,122,132,150,180,200};
        findTheSumOfTheArrayAndPrint(arr);
        printValue(sum);

    }
    public static int findTheSumOfTheArrayAndPrint(int[] array) {

        for (int i : array) {
            sum += i;
        }
        return sum;
    }
    public static void printValue(int print) {
        System.out.println(print);
    }
}
