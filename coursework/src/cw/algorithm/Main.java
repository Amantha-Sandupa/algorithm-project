package cw.algorithm;

import java.io.FileNotFoundException;
import java.io.IOException;

import static cw.algorithm.BenchMark.chooseTextFile;

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
