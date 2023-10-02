package Searching_and_Sorting;
// Divide and Conquer Algorithm
// Pivot Selection: pick an element and mark it as pivot. It can be first/last/any random element.
// Elements can be rotated around pivot
// Partition: Reorder array(Change order around pivot) i.e elements > pivot come after pivot and
// elements < pivot come before pivot
public class quick_sort {

    public static int partition(int arr[],int left,int right){
        int pivot=arr[right];
        int i=left-1; // Initialize i=-1 At start, there is no element which is less than pivot
        for(int j=left;j<right;j++){ // last value of j=right-1 as we already stored arr[right] in pivot
            if(arr[j]<pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        // Set a correct place to pivot
        i++; // need one free space for pivot
        int temp=arr[i];
        arr[i]=arr[right];
        arr[right]=temp;
        return i; // pivot index
    }
    public static void quickSort(int arr[],int left,int right){
        if(left<right){
            int partition_index=partition(arr,left,right);
            quickSort(arr,left,partition_index-1);
            quickSort(arr,partition_index+1,right);
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        quickSort(arr,0,n-1);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
// Define leftmost and rightmost elements: left=0, right=arr.length-1
// keep track of the index of smaller (or equal) elements as i
// While traversing, if we find a smaller element, we swap the current element with arr[i].
// Otherwise, we ignore the current element.

// T.C -> Best case: O(nlogn) Worst case: O(n^2)
// Worst case occurs when pivot is smallest or largest element
// S.C -> Best case: O(nlogn) Worst case: O(n)