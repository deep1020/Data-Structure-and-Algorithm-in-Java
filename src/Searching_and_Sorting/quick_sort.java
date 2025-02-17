package Searching_and_Sorting;

public class quick_sort {

    public static int partition(int arr[],int left,int right){
        int pivot=arr[right];
        int i=left-1;
        for(int j=left;j<right;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
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
// T.C -> O(n^2) or O(nlogn)
// In worst case when pivot is always smallest or largest element. Ex: [1,2,3,4,5] array is already sorted
// Let partitioning step leaves pivot at the left of array. Then n'=0 and comp(n')=comp(0)=0
// Algorithm will select only one element in each iteration so O(n)+O(n-1)+...+O(1) which is equal to O(n^2)
// In the best case, the algorithm will divide the list into two equal size sub-lists. So, the first iteration of the full n-sized list needs O(n)
// Sorting the remaining two sub-lists with n/2 elements takes 2*O(n/2) each. As a result, the QuickSort algorithm has the complexity of O(nlogn)

// S.C -> O(n) or O(logn)
// In worst case, the recursion stack can grow to a depth of n
// In best case, When the array is divided into two equal parts, the depth of recursion is logn
// Ex: [3,2,4,1,5] pivot divides array equally

// Divide and conquer principle
// Approach:
// 1) Choose a pivot: Select an element from the array as the pivot. The pivot element can be first element, last element, or any random element
// 2) Partition the array: Rearrange the array around the pivot. After partitioning, all elements smaller than the pivot will be on its left,
// and all elements greater than the pivot will be on its right. The pivot is then in its correct position, and we obtain the index of the pivot.
// 3) Recursively call: Recursively apply the same process to the two partitioned sub-arrays (left and right of the pivot).
// 4) Base case: Recursion stops when there is only one element left in the sub-array, as a single element is already sorted.