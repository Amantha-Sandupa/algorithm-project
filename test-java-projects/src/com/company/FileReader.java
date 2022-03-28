package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {

    File file = new File("/home/pickme1500/Desktop/Study/algorithm-project/lecture-note/examples/maze10_2.txt");

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}