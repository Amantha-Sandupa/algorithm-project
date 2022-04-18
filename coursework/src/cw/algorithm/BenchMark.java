//Name    -  Amantha Sandupa Mihiranga
//IIT ID  - 20201262
//UOW ID  - w1839499


package cw.algorithm;

import java.awt.*;
import java.io.File;

public class BenchMark {
    static File chooseTextFile() {
        FileDialog dialog = new FileDialog((Frame) null, "Select a File to open");
        dialog.setMode(FileDialog.LOAD);
        dialog.setVisible(true);
        File[] file = dialog.getFiles();
        return file[0];
    }
}



