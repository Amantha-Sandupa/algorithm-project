package com.company;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReadTxtTo2DArray {

    private static final int rows = 10;
    private static final int col = 10;


    public static void main (String[] args) throws FileNotFoundException {

        readFile(); 
    }

    private static void readFile() throws FileNotFoundException {
        int[][] readArray = new int[rows][col];
        Scanner sc = new Scanner(chooseTextFile());

        while (sc.hasNextLine()){
            for (int i=0; i<readArray.length ;i++){
                String[] line = sc.nextLine().trim().split(","+" ");
                for (int j = 0; j < line.length; j++) {
                    readArray[i][j] = Integer.parseInt(line[j]);
                }
            }
        }
        System.out.println(Arrays.deepToString(readArray));
    }

    private static File chooseTextFile() {
        FileDialog dialog = new FileDialog((Frame) null, "Select File to open");
        dialog.setMode(FileDialog.LOAD);
        dialog.setVisible(true);
        File[] file = dialog.getFiles();
        return file[0];
    }

}