package com.company;

import java.util.Random;

public class MergeSortAlgo {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = randomNumber.nextInt(10000);
        }

        System.out.println("Before");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("\nAfter");
        printArray(numbers);

    }

    private static void mergeSort (int[] inputArray){
        int inputLenght = inputArray.length;

        if (inputLenght <2 ){
            return;
        }
        int midIndex = inputLenght/2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLenght - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }

        for (int i = midIndex; i < inputLenght; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        //merge the sorted array to one large one
        merge(inputArray,leftHalf,rightHalf);
    }


    public static void merge (int[] inputArray, int[] leftHalf, int[] rightHalf){

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0,j = 0, k = 0;

        while (i<leftSize && j <rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            }

            else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i<leftSize){
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j<rightSize){
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}
