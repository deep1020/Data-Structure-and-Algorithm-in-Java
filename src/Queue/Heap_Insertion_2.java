package Queue;

public class Heap_Insertion_2 {
    static int insert(int[] arr, int n, int value){
        // n= size of heap
        n=n+1;
        arr[n]=value;
        int i=n;
        while (i>1){
            int parent=i/2;
            if(arr[parent]<arr[i]){
                int temp=arr[parent];
                arr[parent]=arr[i];
                arr[i]=temp;
                i=parent;
            }
        }
        return n;
    }
    static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[100];
        arr[0]=50;
        arr[1]=30;
        arr[2]=40;
        arr[3]=10;
        arr[4]=5;
        arr[5]=20;
        arr[6]=30;

        int n=7;
        int value=60;
        n=insert(arr,n,value);
        printArray(arr,n);
    }
}
