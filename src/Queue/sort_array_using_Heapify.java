package Queue;

public class sort_array_using_Heapify {
    static void heapify(int arr[],int n,int i){
        int parent=i;
        int left=2*i;
        int right=2*i+1;
        if (left<n && arr[left]>arr[parent]){
            parent=left;
        }
        if (right<n && arr[right]>arr[parent]){
            parent=right;
        }
        if(parent!=i){
            int temp=arr[parent];
            arr[parent]=arr[i];
            arr[i]=temp;
            heapify(arr,n,parent);
        }
    }
    static void sort(int arr[],int n) {
        // Build heap
        // Don't need to perform operations on leaf nodes(n/2+1 to n)
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
        // Remove one by one element and move last element at first position
        for(int i=n-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            // Recursively heapify the affected sub-tree
            heapify(arr,i,0);
        }
    }
    static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,2,3,1};
        int n=arr.length;
        sort(arr,n);
        printArray(arr,n);
    }
}
