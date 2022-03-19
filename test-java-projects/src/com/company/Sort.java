package com.company;

public class Sort {


    void printArray(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n; ++i)

            System.out.print(arr[i] + " ");

        System.out.println();

    }

    void bubbleSort(int arr[])

    {

        int n = arr.length;

        for (int i = 0; i < n-1; i++)

            for (int j = 0; j < n-i-1; j++)

                if (arr[j] > arr[j+1])

                {

                    // swap arr[j+1] and arr[j]

                    int temp = arr[j];

                    arr[j] = arr[j+1];

                    arr[j+1] = temp;

                }

    }

    void selectionSort(int arr[])

    {

        int n = arr.length;



        // One by one move boundary of unsorted subarray

        for (int i = 0; i < n-1; i++)

        {

            // Find the minimum element in unsorted array

            int min_idx = i;

            for (int j = i+1; j < n; j++)

                if (arr[j] < arr[min_idx])

                    min_idx = j;
            // Swap the found minimum element with the first

            // element

            int temp = arr[min_idx];

            arr[min_idx] = arr[i];

            arr[i] = temp;

        }

    }

    void merge(int arr[], int l, int m, int r)

    {

        // Find sizes of two subarrays to be merged

        int n1 = m - l + 1;

        int n2 = r - m;



        /* Create temp arrays */

        int L[] = new int[n1];

        int R[] = new int[n2];



        /*Copy data to temp arrays*/

        for (int i = 0; i < n1; ++i)

            L[i] = arr[l + i];

        for (int j = 0; j < n2; ++j)

            R[j] = arr[m + 1 + j];



        /* Merge the temp arrays */
        // Initial indexes of first and second subarrays

        int i = 0, j = 0;



        // Initial index of merged subarry array

        int k = l;

        while (i < n1 && j < n2) {

            if (L[i] <= R[j]) {

                arr[k] = L[i];

                i++;

            }

            else {

                arr[k] = R[j];

                j++;

            }

            k++;

        }



        /* Copy remaining elements of L[] if any */

        while (i < n1) {

            arr[k] = L[i];

            i++;

            k++;

        }
        /* Copy remaining elements of R[] if any */

        while (j < n2) {

            arr[k] = R[j];

            j++;

            k++;

        }

    }

    // Main function that sorts arr[l..r] using

    // merge()

    void mergSort(int arr[], int l, int r)

    {

        if (l < r) {

            // Find the middle point

            int m =l+ (r-l)/2;



            // Sort first and second halves

            mergSort(arr, l, m);

            mergSort(arr, m + 1, r);



            // Merge the sorted halves

            merge(arr, l, m, r);

        }

    }
}

