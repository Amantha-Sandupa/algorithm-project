package com.company;

public class binarySearch {

    public static void main(String[] args) {
        int myArray[] = {-2,3,6,40,60,80,100};
        int searchResult = binarySearch(myArray,3);
        System.out.println("search result = "+searchResult);
    }

    public static int binarySearch (int inoputArray[], int searchValue){
        int startIndex = 0;
        int endIndex = inoputArray.length;

        while (startIndex < endIndex){
            int midIndex = (startIndex + endIndex)/2;
            System.out.println("mid index = "+midIndex);

            if (inoputArray[midIndex] == searchValue){
                return midIndex;

            }else if (inoputArray[midIndex]< searchValue){
                startIndex = midIndex+1;

            }else {
                startIndex = midIndex;
            }
        }
        return -1;
    }
}




