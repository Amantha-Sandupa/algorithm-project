package com.company;

import java.awt.*;
import java.io.*;
import java.util.*;
import java.util.List;

/*
    PuzzleClass where I Read My input File and Insert it Into a 2D array
    And create the graph from 2D array
    Student ID - w1810803
    Student name - Dineth Chamika
 */

public class PuzzleClass {
    private int COLUMNS;
    private int ROWS;
    private PointCoordinate[][] matrixMap;
    private PointCoordinate startPoint;
    private PointCoordinate endPoint;
    private int maxWidth;
    private int maxHeight;
    /*
     * Read the File that give the input as from the chooseMyFile method
     * and Insert its Data Into  2D array
     */
    public void readFile() throws IOException {
        try {

            File myFile = new File(String.valueOf(chooseMyFile()));
            Scanner myReader = new Scanner(myFile);
            Scanner scanner = new Scanner(myFile);
            COLUMNS = scanner.nextLine().length();
            int rowCount = 1;
            while(scanner.hasNext()){
                scanner.nextLine();
               rowCount++;
            }
            ROWS                = rowCount;
            int rowNumber       = 0;
            int characterNumber = 0;
            matrixMap           = new PointCoordinate[ROWS][COLUMNS];
            maxHeight           = ROWS;
            maxWidth            = COLUMNS;

            while (myReader.hasNext()) {
                String data = myReader.nextLine();
                for (int i = 0; i < COLUMNS; i++){
                    PointCoordinate pointCoordinate = new PointCoordinate(characterNumber,i,rowNumber,data.charAt(i));
                    matrixMap[rowNumber][i] = pointCoordinate;
                    if(pointCoordinate.getCharacter().equals('S')){
                        startPoint = pointCoordinate;// If programme found a character as S assign that as the starting point
                    }
                    if(pointCoordinate.getCharacter().equals('F')){
                        endPoint = pointCoordinate;// If programme found a character as F assign that as the Ending point
                    }
                    characterNumber++;
                }
                rowNumber++;
            }
            for (int i = 0; i < COLUMNS; i++){
                System.out.print("[");
                for (int j = 0; j < ROWS; j++){
                    System.out.print(matrixMap[i][j].getCharacter()+", ");
                }
                System.out.print("]");
                System.out.println();

            }
            myReader.close();
            scanner.close();
            System.out.println("");
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    /*
     * The method to choose the Input File
     *
     */
    private File chooseMyFile() {
        FileDialog dialog = new FileDialog((Frame) null, "Select File to open");
        dialog.setMode(FileDialog.LOAD);
        dialog.setVisible(true);
        File[] file = dialog.getFiles();
        return file[0];
    }
}
