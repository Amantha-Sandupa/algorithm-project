package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class D2Array {

    public static void main(String[] args) {
        int[][] my2DArray = new int[2][3];
        my2DArray[0][0] = 4;
        my2DArray[0][1] = 6;
        my2DArray[0][2] = 1;
        my2DArray[1][0] = 9;
        my2DArray[1][1] = 2;
        my2DArray[1][2] = 3;

        System.out.println(Arrays.deepToString(my2DArray));


        String[][] newArray = new String [3][4];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letters");




        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                String input = sc.nextLine();
                newArray[i][j] = input;
            }
        }
        System.out.println(Arrays.deepToString(newArray));
    }



}
