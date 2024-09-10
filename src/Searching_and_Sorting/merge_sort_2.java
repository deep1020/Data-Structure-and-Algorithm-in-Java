package Searching_and_Sorting;

public class merge_sort_2 {
    public static void divide(int arr[],int left,int right){
        if(left<right){
            int mid=left+(right-left)/2;
            divide(arr,left,mid);
            divide(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    public static void merge(int arr[],int left,int mid,int right){
        // size of two divided array
        int n1=mid-left+1;
        int n2=right-mid;
        // craete temp arrays and copy elements to temp arrays L and R
        int L[]=new int[n1];
        int R[]=new int[n2];
        for(int i=0;i<n1;i++){
            L[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=left;
        // Merge the temp arrays back into array
        while(i<n1 && j<n2) {
            if(L[i]<=R[j]) {
                arr[k++]=L[i++];
            } 
            else{
                arr[k++]=R[j++];
            }
        }
        // Copy remaining elements of left[] if any
        while(i<n1){
            arr[k++]=L[i++];
        }
        // Copy remaining elements of right[] if any
        while(j<n2){
            arr[k++]=R[j++];
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
        divide(arr,0,arr.length-1);
        System.out.println("\nSorted array");
        printArray(arr);
    }
}
// T.C -> O(nlogn)
// S.C -> O(1)
