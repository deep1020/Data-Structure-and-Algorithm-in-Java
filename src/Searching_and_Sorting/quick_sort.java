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
