package com.company;

import java.util.concurrent.TimeUnit;

//import static sun.jvm.hotspot.HelloWorld.fib;

public class BenchMark {
    public static void testBenchmark(){

        long start = System.currentTimeMillis();


        for (int i = 0; i < 44; i++) {
            System.out.println("Test");
        }


        long end = System.currentTimeMillis();

        double totalTime = (double)(end - start)/1000;

        System.out.println(totalTime);
    }

    public static void main(String[] args) {

        testBenchmark();
    }


}
