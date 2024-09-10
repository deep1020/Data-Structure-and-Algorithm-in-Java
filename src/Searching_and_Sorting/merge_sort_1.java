package Searching_and_Sorting;

import java.util.Arrays;

public class merge_sort_1 {
    public static void divide(int arr[]){
        if(arr.length>1){
            int mid= arr.length/2;
            int left[]= Arrays.copyOfRange(arr,0,mid);
            int right[]=Arrays.copyOfRange(arr,mid,arr.length);
            divide(left);
            divide(right);
            merge(arr,left,right);
        }
    }
    public static void merge(int arr[],int left[],int right[]){
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        while(i<left.length){
            arr[k++]=left[i++];
        }
        while(j<right.length){
            arr[k++]=right[j++];
        }
    }
    public static void printArray(int[] arr) {
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={12,11,13,5,6,7};
        System.out.println("Given Array");
        printArray(arr);
        divide(arr);
        System.out.println("\nSorted array");
        printArray(arr);
    }
}
// T.C -> O(nlogn)
// S.C -> O(1)

// divide() method:
// Recursively splits the input array into two halves until it reaches subarrays of length 1 or 0.
// Base Case: If the array length is 1 or less, the function returns without doing anything, as such an array is already sorted.
// Divide Step: The array is split into two halves using Arrays.copyOfRange.
// Recursive Call: The divide method is called recursively on the left and right subarrays.
// Merge Step: The merge method is called to combine the sorted subarrays back into a single sorted array.

// merge() method:
// Takes two sorted subarrays and merges them into a single sorted array.
// Merge Step: Three pointers (i, j, k) are used to track the current index of the left array, right array, and the merged array, respectively.
// Comparison and Merge: Elements from the left and right arrays are compared and the smaller element is placed into the original array (arr).
// Remaining Elements: Any remaining elements in the left or right array are copied into the original array.

// printArray() method:
// prints the elements of an array