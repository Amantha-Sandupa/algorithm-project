
//        IIT - 20201262
//        UOW - w1839499
//        Name - Amantha Sandupa Mihiranga

package com.company;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        char[][] pathFinder;

        System.out.println("STARTING THE PROGRAM \n");
//        opening the file
        Graph puzzleMaze = new Graph(chooseTextFile());

        puzzleMaze.wordCount();
        pathFinder = puzzleMaze.twoDarray();

        for (int i = 0; i < pathFinder.length; i++) {
            System.out.println(pathFinder[i]);
        }

        System.out.println();
        System.out.println("END OF THE PROGRAM");
        System.exit(0);

    }


//    choosing the file
    private static File chooseTextFile() {
        FileDialog dialog = new FileDialog((Frame) null, "Select a File to open");
        dialog.setMode(FileDialog.LOAD);
        dialog.setVisible(true);
        File[] file = dialog.getFiles();
        return file[0];
    }
}