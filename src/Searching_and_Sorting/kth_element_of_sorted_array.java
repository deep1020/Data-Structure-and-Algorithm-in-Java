package Searching_and_Sorting;

public class kth_element_of_sorted_array {
    static int kth(int arr1[],int arr2[],int m,int n,int k){
        int sorted[]=new int[m+n];
        int i=0,j=0,d=0;
        while (i<m && j<n){
            // If the element of arr1 is smaller, insert the element from arr1 to the sorted array
            if(arr1[i]<arr2[j]){
                sorted[d++]=arr1[i++];
            }
            // If the element of arr2 is smaller, insert the element from arr2 to the sorted array
            else{
                sorted[d++]=arr2[j++];
            }
        }
        // Push the remaining elements of arr1
        while (i<m){
            sorted[d++]=arr1[i++];
        }
        // Push the remaining elements of arr2
        while (j<n){
            sorted[d++]=arr2[j++];
        }
        // Return the element at kth position in the merged sorted array
        return sorted[k-1];
    }
    public static void main(String[] args) {
        int arr1[] = { 3, 4, 7, 11, 14 };
        int arr2[] = { 1, 5, 8, 10 };
        int k=5;
        System.out.println(kth(arr1,arr2,arr1.length,arr2.length,k));
    }
}
// T.C -> O(n)
// S.C -> O(m+n)
