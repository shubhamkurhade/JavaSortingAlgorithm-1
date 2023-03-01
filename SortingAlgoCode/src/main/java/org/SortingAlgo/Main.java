package org.SortingAlgo;

import org.SortingAlgo.AlgoController.SortAlgo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // our main runner
/*----------------------------------------------------------------------------------------*/
        // Array Initialisation
        Scanner sc = new Scanner(System.in);

        //Let's get the size of the array from user
        int arraySize; // size of the array
        System.out.println("Enter the Size of an Array: ");
        arraySize = sc.nextInt();

        // Let's get the array elements from user
        int[] array = new int[arraySize];
        System.out.println("Please enter the elements of an array: ");
        for(int i=0; i<arraySize; i++)
        {
            array[i] = sc.nextInt();
        }
/*-----------------------------------------------------------------------------------------*/
        // Creating the instance of the sorting algo
        SortAlgo sort = new SortAlgo();

        System.out.println("For sorting the given array, Please choose Sorting Algorithm from below list");
        System.out.println("1. Selection Sort");
        System.out.println("2. Bubble Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Merge Sort");
        System.out.println("5. Quick Sort ");
        System.out.println("Select your operation: ");
        int choice = sc.nextInt();
/*----------------------------------------------------------------------------------------*/
        // Creating the choice cases
        switch(choice)
        {
            case 1:
            {
               sort.Selection(array);
               break;
            }
            case 2:
            {
                sort.Bubble(array);
                break;
            }
            case 3:
            {
                sort.Insertion(array);
                break;
            }
            case 4:
            {
                sort.mergeSort(array, 0, arraySize-1);
                break;
            }
            case 5:
            {
                sort.Quick(array);
                break;
            }
            default:
            {
                System.out.println("As no option is selected, code evaluates with the best Time complexity method");
            }
        }
/*----------------------------------------------------------------------------------------*/
        // Printing the ans
        ArrayPrinter.PrintArry(array);
    }
}