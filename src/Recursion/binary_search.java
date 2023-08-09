package Recursion;

public class binary_search {

    static int binarySearch(int arr[],int low,int high,int target){

        if(low<=high && low<=arr.length-1) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return binarySearch(arr, mid + 1, high, target);
            } else {
                return binarySearch(arr, low, mid - 1, target);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int target=40;
        int result=binarySearch(arr,0, arr.length-1, target);
        if(result==-1){
            System.out.println("Element not present");
        }
        else {
            System.out.println("Element found at index "+result);
        }

    }
}
