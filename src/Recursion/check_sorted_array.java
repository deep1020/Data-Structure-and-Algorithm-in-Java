package Recursion;

public class check_sorted_array {
    static boolean isSorted(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            // Array is sorted till now
            return isSorted(arr,idx+1);
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,3};
        System.out.println(isSorted(arr,0));
    }
}
// T.C -> O(n)
// S.C -> O(n)

// check every index with the value of index+1. if(arr[idx]<arr[idx+1]) then call to the next level i.e idx+1
// otherwise return false
// return isSorted(arr,idx+1) Till now we checked array is sorted or not but we didn't check all other elements in array
// isSorted(arr,idx+1) if we move to the next elements in array it return true otherwise false