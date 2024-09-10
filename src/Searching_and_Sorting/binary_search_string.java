package Searching_and_Sorting;

public class binary_search_string {

    public static void main(String[] args) {
        String arr[]={"apple","banana","cherry","grape","mango"};
        String target="banana";
        int index=binarySearch(arr,target);
        System.out.println("Index of "+target+" is "+index);
    }
    public static int binarySearch(String arr[],String target){
        int left=0;
        int right=arr.length+1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int comparison=target.compareTo(arr[mid]);
            if(comparison==0){
                return mid;
            }
            else if(comparison>0){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
}
// T.C -> O(logn)
// S.C -> O(1)
// compareTo() method compares the given string with the current string lexicographically.
// lexicographically is a common name used for the alphabetic order or the sequence of ordered symbols in the dictionaries or elements of an ordered set.
// It returns a positive number, a negative number, or 0.
// It compares strings based on the Unicode value of each character in the strings.
// Comparison of target and arr[mid]
// If target==arr[mid], it returns 0
// If target>arr[mid], it returns positive number
// If target<arr[mid], it returns negative number
