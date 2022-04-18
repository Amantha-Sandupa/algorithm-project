
//        IIT - 20201262
//        UOW - w1839499
//        Name - Amantha Sandupa Mihiranga


package com.company;

import java.io.*;
import java.util.Scanner;
import java.io.IOException;

public class Graph {
    private int columnsCount; int rowsCount;
    private File inputFile;
    File textFile;

    //Constructor
    public Graph(File fileName) {
        this.inputFile = fileName;
    }


//    this method is to count the rows and colms to create 2d array
    public void wordCount() throws IOException{
    textFile = new File(String.valueOf(this.inputFile));
    LineNumberReader getRowsAndCols = new LineNumberReader(new FileReader(textFile));
    String firstLine;

    Scanner sc = new Scanner(textFile);

    firstLine = sc.nextLine();


        for (int i = 0; i < firstLine.length(); i++) {
            //counting the columns
            columnsCount++;
        }
        while (getRowsAndCols.readLine() != null){
            //counting the rows
            rowsCount++;
        }





    }


//    public static void wordCount(int numLines, int numChar, int numWords) {
//        Scanner myFile = null;
//        try {
//            Scanner file = new Scanner(new File("/home/pickme1500/Desktop/Study/algorithm-project/lecture-note/examples/maze10_4.txt"));
//            myFile = file;
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("Error");
//        }
//
//        while (myFile.hasNextLine()){
//            String curLine = myFile.nextLine();
//            int size = curLine.length();
//            boolean foundiv = true;
//            boolean foundChar = false;
//
////            check weather current line's words
//            for (int i = 0; i < size; i++) {
//                if(curLine.charAt(i)== ' '){
//                    foundiv = true;
//                    foundChar = false;
//                }else {
//                    foundChar = true;
//                    numChar++;
//                }
//
//                if (foundChar && foundiv){
//                    numWords++;
//                    foundiv = false;
//                }
//            }
//            numLines++;
//        }
//
////        System.out.println( "Number of words = "+ numWords);
//        System.out.println("Number of lines = "+ numLines);
//        System.out.println("Number of chars = "+numChar/numLines);
//
//    }



//    Creating 2D array
//    get the rows and colms by using above method
    public char[][] twoDarray() throws FileNotFoundException{
        textFile = new File(String.valueOf(inputFile));
        Scanner sc = new Scanner(textFile);
        System.out.println("Number of rows  -  " + rowsCount);
        System.out.println("Number of Colms -  "+ columnsCount);
        System.out.println();
        char[][] mazeGame = new char[rowsCount][columnsCount];

        for (int row = 0; sc.hasNextLine() && row < rowsCount; row++) {
            char[] stringTOChar = sc.nextLine().toCharArray();
            for (int i = 0; i < columnsCount && i < stringTOChar.length; i++) {
                mazeGame[row][i] = stringTOChar[i];
            }
        }
        return mazeGame;
    }
}
