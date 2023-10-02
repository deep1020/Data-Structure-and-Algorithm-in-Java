package Queue;

public class Heap_Deletion {
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
    static int delete(int arr[],int n){
        arr[0]=arr[n-1];
        n=n-1;
        heapify(arr,n,0);
        return n;
    }
    static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={40,30,10,20,15}; //30 20 10 15
        int n=arr.length;
        n=delete(arr,n);
        printArray(arr,n);
    }
}
