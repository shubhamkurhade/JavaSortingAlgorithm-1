package org.SortingAlgo;

public class ArrayPrinter {
    public static void PrintArry(int[] array) {
        System.out.println("The sorted array is: ");
        int n = array.length;
        for(int i=0; i<n; i++)
        {
            System.out.println(array[i]+" ");
        }
        System.out.println("Thank you for using the program!");
    }
}
