package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {

    public static void wordCount() {
        int numLines = 0, numWords = 0, numChar = 0;

        Scanner myFile = null;
        try {
           Scanner file = new Scanner(new File("/home/pickme1500/Desktop/Study/algorithm-project/lecture-note/examples/maze10_4.txt"));
            myFile = file;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error");
        }

        while (myFile.hasNextLine()){
            String curLine = myFile.nextLine();
            int size = curLine.length();
            boolean foundiv = true;
            boolean foundChar = false;

//            check weather current line's words
            for (int i = 0; i < size; i++) {
                if(curLine.charAt(i)== ' '){
                    foundiv = true;
                    foundChar = false;
                }else {
                    foundChar = true;
                    numChar++;
                }

                if (foundChar && foundiv){
                    numWords++;
                    foundiv = false;
                }
            }
            numLines++;
        }

//        System.out.println( "Number of words = "+ numWords);
        System.out.println("Number of lines = "+ numLines);
        System.out.println("Number of chars = "+numChar/numLines);

    }



    public static void main(String[] args) {
        wordCount();
    }
}
