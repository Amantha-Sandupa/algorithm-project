package com.company;

public class Main {

    public static void main(String[] args) {

        int myArray[] = new int[6];
//        one index take 4 bytes

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = 11 + i;
        }

//        for (int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);
//        }

        int seachResult = lienarSearch(myArray,16);
        System.out.println(seachResult);

    }

    public static int lienarSearch(int inputArray[], int searchValue){
        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }
}
