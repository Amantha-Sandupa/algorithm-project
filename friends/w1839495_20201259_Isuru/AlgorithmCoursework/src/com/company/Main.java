
//        IIT - 20201262
//        UOW - w1839499
//        Name - Amantha Sandupa Mihiranga

package com.company;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import static com.company.BenchMark.*;

public class Main {

    public static void main(String[] args) throws IOException {
        char[][] pathFinder;

        System.out.println("STARTING THE PROGRAM \n");
//        opening the file
        Graph puzzleMaze = new Graph(chooseTextFile());

        long start = System.currentTimeMillis();

        puzzleMaze.wordCount();
        pathFinder = puzzleMaze.twoDarray();

        for (int i = 0; i < pathFinder.length; i++) {
            System.out.println(pathFinder[i]);
        }

        System.out.println();
        System.out.println("END OF THE PROGRAM");

        double end = System.currentTimeMillis();
        double totalTime = (end - start)/1000;
        System.out.println("Total time to execute - "+totalTime);
        System.exit(0);


    }
}