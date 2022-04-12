package Homework5;

import static Homework5.Exercise2.printValuesOf2dArrayForEach;

public class Exercise6 {
    private static int[][] my2DArray = new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
    public static void main(String[] args) {

        // print the array to create a visual representation of the array
        printValuesOf2dArrayForEach(my2DArray);
        calculateDiagonalsOfAnArray(my2DArray);
    }
    public static void calculateDiagonalsOfAnArray (int [][] array){
        int diagonalA = 0;
        int diagonalB = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j){
                    diagonalA += my2DArray[i][j];
                }
                if (( i + j ) == ( 4 - 1 )){
                    diagonalB += my2DArray[i][j];
                }
            }
        }
        System.out.println("==========================");
        System.out.println("Diagonal A is: " + diagonalA);
        System.out.println("Diagonal B is: " + diagonalB);

    }
}
