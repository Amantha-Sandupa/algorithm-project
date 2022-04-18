package cw.algorithm;

import java.io.*;
import java.util.Scanner;

public class Graph {

    private int columnsCount;
    int rowsCount;
    private File inputFile;
    File textFile;

    //Constructor
    public Graph(File fileName) {
        this.inputFile = fileName;
    }

    public void wordCount() throws IOException {
        textFile = new File(String.valueOf(this.inputFile));
        LineNumberReader getRowsAndCols = new LineNumberReader(new FileReader(textFile));
        String firstLine;

        Scanner sc = new Scanner(textFile);

        firstLine = sc.nextLine();


        for (int i = 0; i < firstLine.length(); i++) {
            //counting the columns
            columnsCount++;
        }
        while (getRowsAndCols.readLine() != null) {
            //counting the rows
            rowsCount++;
        }
    }

    public char[][] twoDarray() throws FileNotFoundException {
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
