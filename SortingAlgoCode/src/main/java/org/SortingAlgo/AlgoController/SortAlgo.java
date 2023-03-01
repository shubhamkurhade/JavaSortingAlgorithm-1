package org.SortingAlgo.AlgoController;

import java.util.ArrayList;

public class SortAlgo {

    // Selectrion Sort Method -> Select the minimum and swap
    public void Selection(int[] nums) {
        int n= nums.length;
        for(int i=0; i<n-1; i++) // loop to iterate
        {
            int min = i;
            for(int j=i; j<n; j++) // loop to find the minimum element
            {
                if(nums[j] < nums[min])
                    min = j;
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
    }

    // Bubble Sort Method -> Select the Maximum and Swap Adjacent
    public void Bubble(int[] nums) {
        int n = nums.length;
        for(int i=n-1; i>=0; i--)
        {
            int swapCheck=0; // if the array is already sorted we will not do the iteration and swapping
            for(int j=0; j<i; j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j]=temp;
                    swapCheck=1;
                }
            }
            if(swapCheck == 0) break;
        }
    }

    // Insertion Sort Method -> Takes the element and puts it to its actual position as per order
    public void Insertion(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++)
        {
            int j=i;
            while(j>0 && nums[j]<nums[j-1])
            {
                int temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
                j--;
            }
        }
    }

    // Merge Sort Method ->

    public void merge(int[] array, int low, int mid, int high)
    {
        // this is merge method
        ArrayList<Integer> temp = new ArrayList<>(); // this is our temp data structure which will hold our data while merging
        int left = low;
        int right = mid+1;

        // low ..... mid ..... high
        // left ........right

        while(left<=mid && right<=high)
        {
            if(array[left] <= array[right])
            {
                temp.add(array[left]);
                left++;
            }else{
                temp.add(array[right]);
                right++;
            }
        }
        while(left<=mid)
        {
            temp.add(array[left]);
            left++;
        }
        while(right<=high)
        {
            temp.add(array[right]);
            right++;
        }
        for(int i=low; i<=high; i++)
        {
            array[i] = temp.get(i-low);
        }
    }
    public void mergeSort(int[] array, int low, int high) {

        // this is diviide method
        if(low >= high) return; // base case

        int mid = (low+high)/2;

        mergeSort(array, low, mid);
        mergeSort(array, mid+1, high);

        merge(array, low, mid, high);
    }

    // Quick Sort Method ->
    public void Quick(int[] array) {
        System.out.println("Alien is still coding");
    }
}
