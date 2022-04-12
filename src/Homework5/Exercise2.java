package Homework5;

public class Exercise2 {
    private static int[][] myArr = new int[][]{{22, 33, 44, 55}, {11, 66, 88}};

    public static void main(String[] args) {
        printValuesOf2dArrayForEach(myArr);
        System.out.println("==================");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(myArr[i][j]);
            }
        }
    }
    public static void printValuesOf2dArrayForEach(int[][] array) {
        for (int[] i: array) {
            System.out.print("| ");
            for (int j: i) {
                if (j < 10 ){
                    System.out.print("  " + j + " | ");
            }else if (j >= 10 && j < 100){
                    System.out.print(" " + j + " | ");
                }else if(j >= 100 && j < 1000){
                    System.out.print(j + " | ");
                }
            }
            System.out.println();
        }
    }
}
