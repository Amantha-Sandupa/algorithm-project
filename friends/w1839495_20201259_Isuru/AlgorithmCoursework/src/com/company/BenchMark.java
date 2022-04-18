package com.company;

import java.awt.*;
import java.io.File;
import java.io.IOException;

//import static com.company;

public class BenchMark {

    long x;
    public static void benchmarkStart (){

//        long x = start;
    }


    public static void benchmarkEnd(){
    }


    public static void mainMethod() throws IOException {


    }



    static File chooseTextFile() {
        FileDialog dialog = new FileDialog((Frame) null, "Select a File to open");
        dialog.setMode(FileDialog.LOAD);
        dialog.setVisible(true);
        File[] file = dialog.getFiles();
        return file[0];
    }

}
