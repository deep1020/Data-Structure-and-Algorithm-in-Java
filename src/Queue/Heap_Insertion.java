package Queue;

public class Heap_Insertion {
    static int insertNode(int arr[],int n,int value){
        n=n+1; // Increase size of heap by 1
        arr[n-1]=value; // Insert element at the end of heap
        int i=n-1;
        while(i>0){
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
        int arr[]=new int[100];
        arr[0]=50;
        arr[1]=30;
        arr[2]=40;
        arr[3]=10;
        arr[4]=5;
        arr[5]=20;
        arr[6]=30;
        int n=7;
        int value=60;
        n=insertNode(arr,n,value);
        printArray(arr,n);
    }
}

// T.C -> O(logn)
// S.C -> O(n)

//int arr[]={50,30,40,10,5,20,30};
//int n=arr.length;
//int value=60;
//n=insertNode(arr,n,value);
//printArray(arr,n);
