package Searching_and_Sorting;

public class merge_sort {

    static void divide(int arr[],int left,int right){
        // In case further division is not possible when we have only one element remained, return from that point
        if(left>=right){
            return;
        }
        int mid=left+(right-left)/2;
        divide(arr,left,mid);
        divide(arr,mid+1,right);
        conquer(arr,left,mid,right);
    }
    static void conquer(int arr[],int left,int mid,int right){
        int merge[]=new int[right-left+1]; // size= from starting to end
        int idx1=left;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=right){
            if(arr[idx1]<=arr[idx2]){
                merge[x++]=arr[idx1++];
            }
            else {
                merge[x++]=arr[idx2++];
            }
        }
        // In case we already completed one array but still remain an element in another array
        while (idx1<=mid){ // Either this loop goes
            merge[x++]=arr[idx1++];
        }
        while (idx2<=right){ // or this loop goes
            merge[x++]=arr[idx2++];
        }
        // copy elements of merged elements into original array
        for(int i=0,j=left;i<merge.length;i++,j++){
            arr[j]=merge[i];
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        divide(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
