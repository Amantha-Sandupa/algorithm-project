package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistClass {

    public static void main(String[] args) {
        ArrayList<Integer> integerArray = new ArrayList<>();
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Strawberry");
        fruits.add("Papaya");
        System.out.println(fruits);
        fruits.add(1,"guava");

        System.out.println(fruits);

        System.out.println(fruits.get(1));
        System.out.println(fruits.get(0));

        //changing an element
        fruits.set(2,"orange");
        System.out.println(fruits);
        //string are immutable, strawberry remove and add orange to it, strawberry is removed by java garbage collector

        System.out.println();

//        removing an element
//        1 - removing by index
        fruits.remove(0);
        System.out.println(fruits);
//        2 - removing by value
        fruits.remove("Papaya");
        System.out.println(fruits);

//        to remove all the elements
//        fruits.clear();

//        size (dynamic size - the six=ze can be changed according to the elements of an arraylist)
        System.out.println(fruits.size());


    }

}
