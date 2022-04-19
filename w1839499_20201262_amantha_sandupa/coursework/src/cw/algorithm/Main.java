//Name    -  Amantha Sandupa Mihiranga
//IIT ID  - 20201262
//UOW ID  - w1839499



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

        //calculating the execution time for a benchmark
        long start = System.currentTimeMillis();

        puzzleMaze.wordCount();
        pathFinder = puzzleMaze.twoDarray();

        for (int i = 0; i < pathFinder.length; i++) {
            System.out.println(pathFinder[i]);
        }

        System.out.println();
        System.out.println("END OF THE PROGRAM");

        //calculate the execution time
        double end = System.currentTimeMillis();
        double totalTime = (end - start)/1000;
        System.out.println("Total time to execute - "+totalTime +"S");

        // add a manual exit code
        System.exit(0);

    }
}
