package Queue;

public class Heap_Deletion_2 {
    static void delete(int arr[], int n) {
        arr[0]=arr[n-1];
        n=n-1;
        int i=0;
        while(i<n) {
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
                i=parent;
            }
            else {
                break; // No more swapping needed
            }
        }
    }
    static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={40,30,10,20,15}; //30 20 10 15
        int n=arr.length;
        delete(arr,n);
        n--;
        printArray(arr,n);
    }
}

//    static void delete(int arr[],int n){
//        arr[0]=arr[n-1];
//        n=n-1;
//        int i=1;
//        while(i<n){
//            int left=arr[2*i];
//            int right=arr[2*i+1];
//            int larger=left>right ? 2*i : 2*i+1;
//            if(arr[i]<arr[larger]){
//                int temp=arr[i];
//                arr[i]=arr[larger];
//                arr[larger]=temp;
//                i=larger;
//            }
//            else {
//                return;
//            }
//        }
//    }
//    static void printArray(int arr[],int n){
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
