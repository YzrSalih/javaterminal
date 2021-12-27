package Exercises.Task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    /*
    Sample 2 Dimensional Array
         143
         234
         123
         diagonal - 1 and 3 and 3
         Calculation of Elements above diagonal = 11
    */
        int[][] arr = { { 1, 4 ,3 }, { 2, 3 ,4 }, { 1, 2 ,3 } };
        System.out.println(arr[0].length);
        System.out.println("Calculation of diagonal and its above = " + calculateElementsAboveDiagonal(arr));
        exceedValuesBelowDiagonal(arr);
        for (int[] array : arr) {
            System.out.println(Arrays.toString(array));
        }

        /*
        [1, 4, 3]
        [3, 3, 4]
        [2, 3, 3]
        */
    }
    public static int calculateElementsAboveDiagonal(int[][] arr){
        int sum = 0;
        for(int i = 0 ; i < arr.length ; ++i) {
            for(int j = i  ; j < arr[i].length ; ++j) {
                sum += arr[i][j];
            }
        }

        return sum;
    }

    public static void exceedValuesBelowDiagonal (int[][] arr){
        for(int i = 0 ; i < arr.length ; ++i) {
            for(int j = 0  ; j < arr[i].length ; ++j) {
                if(i>j) {
                    arr[i][j]++;
                }
            }
        }
    }
}
