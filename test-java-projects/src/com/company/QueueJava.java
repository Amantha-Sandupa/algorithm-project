package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class QueueJava {
    public static void main(String[] args) {
        Queue<String> bbq = new LinkedList();

        bbq.add("Amantha");
        bbq.add("Hansika");
        bbq.add("Yasara");
        bbq.add("Dilsha");

        System.out.println(bbq);
        System.out.println();

//        size
        System.out.println(bbq.size());

//        contains anything
        System.out.println(bbq.contains("Hansika"));


//        removing an element
        bbq.poll(); //will remove Amantha from the list
        System.out.println(bbq.poll());
        System.out.println(bbq);

//        take a peek
        System.out.println(bbq.peek());



    }
}
