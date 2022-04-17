package com.company;

import java.util.Stack;

public class StackInJava {

    public static void main(String[] args) {

        Stack<String> games = new Stack();
        games.add("COD");
        games.add("Prince of persia");
        games.add("super monkey ball");

        System.out.println(games);

        //remove the elements (stack always removes the last element )
        System.out.println(games.pop());
        System.out.println(games);
    }
}
