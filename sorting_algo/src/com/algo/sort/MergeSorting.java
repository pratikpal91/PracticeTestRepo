package com.algo.sort;

public class MergeSorting {
	
	public static void main(String args[]) 
    { 
        int arr[] = {13,12,11,10,9}; 
  
        System.out.println("Given Array"); 
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        } 
  
        MergeSorting.mergeSort(arr); 
  
        System.out.println("\nSorted array"); 
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    } 
	
	public static void mergeSort(int[] inputArray) {
        int size = inputArray.length;
        if (size < 2)
            return;
        int mid = size / 2;
        int leftSize = mid;
        int rightSize = size - mid;
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];
        for (int i = 0; i < mid; i++) {
            left[i] = inputArray[i];

        }
        for (int i = mid; i < size; i++) {
            right[i - mid] = inputArray[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, inputArray);
    }

    public static void merge(int[] left, int[] right, int[] arr) {
        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }
        while (i < leftSize) {
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < rightSize) {
            arr[k] = right[j];
            k++;
            j++;
        }
    }

	
}
