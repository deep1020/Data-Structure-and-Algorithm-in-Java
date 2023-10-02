package Arrays_class;
// containing static methods that are used with arrays in order to search, sort, compare, insert elements, or
// return a string representation of an array
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Arrays_method {
    static int[] sort(int arr1[]){
        Arrays.sort(arr1);
        return arr1;
    }
    static Integer[] reverseSort(Integer[] arr2){
        Arrays.sort(arr2, Collections.reverseOrder());
        return arr2;
    }
    public static void main(String[] args) {
        int arr1[]={5,4,2,6,3};
        int sortedArray[]=sort(arr1);
        System.out.println("Sorted Array: "+Arrays.toString(sortedArray));
        // toString(): Returns a string representation of the contents of the specified array
        // we have Integer here instead of int[] as Collections.reverseOrder doesn't work for primitive types.
        Integer arr2[]={5,4,2,6,3};
        Integer[] reverseSort =reverseSort(arr2);
        System.out.println("Reverse Array: "+ Arrays.toString(arr2));
    }
}
