package Array;
// containing static methods that are used with arrays in order to search, sort, compare, insert elements, or
// return a string representation of an array
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Arrays_method {
    static int[] sort(int arr2[]){
        Arrays.sort(arr2);
        return arr2;
    }
    static Integer[] reverseSort(Integer[] arr3){
        Arrays.sort(arr3, Collections.reverseOrder());
        return arr3;
    }
    public static void main(String[] args) {
        int arr1[]={3,2,5,1,4};
        Arrays.fill(arr1,10);
        System.out.println("Array completely filled with 10\n"+Arrays.toString(arr1));
        Arrays.fill(arr1,1,4,5); // fromIndex (inclusive), toIndex (exclusive), val (set value)
        System.out.print(Arrays.toString(arr1)+"\n");

        // stream(): It is used to get a Sequential Stream from the array passed as the parameter with its elements
        // It returns a sequential Stream with the elements of the array, passed as parameter
        IntStream stream=Arrays.stream(arr1);
        stream.forEach(str-> System.out.print(str+" "));

        // toString(): Returns a string representation of the contents of the specified array
        // we have Integer here instead of int[] as Collections.reverseOrder doesn't work for primitive types.
        int arr2[]={5,4,2,6,3};
        int sortedArray[]=sort(arr2);
        System.out.println("\nSorted Array: "+Arrays.toString(sortedArray));

        Integer arr3[]={5,4,2,6,3};
        Integer[] reverseSort =reverseSort(arr3);
        System.out.println("Reverse Array: "+ Arrays.toString(arr3));

        // asList(): Return a fixed-size list backed by the specified array
        // This method acts as a bridge between array-based and collection-based APIs, in combination with Collection.toArray()
        List<Integer> list=Arrays.asList(arr3);
        System.out.println("asList() method: "+list);

        // copyOf(originalArray,newLength): It copies the specified array, truncating or padding with false (if necessary) so the copy has the specified length
        int arr4[]={1,2,3};
        System.out.println("Original Array");
        for(int i=0;i<arr4.length;i++){
            System.out.print(arr4[i]+" ");
        }
        int copy[]=Arrays.copyOf(arr4,5);
        copy[3]=11;
        // If the length of a copied array is greater than the original array
        // The two arrays will have same values for all the indices that are valid in original array and new array
        // However, the indices missing in original will have zero in copy in case the copied array length is more than the original array
        System.out.println(Arrays.toString(Arrays.copyOf(arr4,5)));
        for(int i=0;i<copy.length;i++){
            System.out.print(copy[i]+" ");
        }

        // copyOfRange(originalArray,fromIndex,endIndex)
        System.out.println("\nNew array using copyOfRange() method");
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr4,1,3)));

        // binarySearch(): search for the specified element in the array with the help of the binary search algorithm
        int arr5[]={6,2,8,3,10,4};
        Arrays.sort(arr5);
        int target=10;
        System.out.println("\nbinarySearch() method:");
        System.out.println(target+" found at index: "+Arrays.binarySearch(arr5,target));

        // equals(): check whether two arrays are equal or not. Two arrays are considered equal if both arrays contain the same number of elements,
        // and all corresponding pairs of elements in the two arrays are equal
        int arr6[]={3,4,5,1};
        int arr7[]={3,4,1,5};
        System.out.println("Is arr6 equals to arr7: "+Arrays.equals(arr6,arr7));

        // mismatch(): return the index of element where index is mismatched
        System.out.println("The element mismatched at index: "+Arrays.mismatch(arr6,arr7));
    }
}
