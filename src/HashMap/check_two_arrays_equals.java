package HashMap;

import java.util.HashMap;
import java.util.Map;

public class check_two_arrays_equals {
    static boolean areEqualArrays(int A[],int B[]){
        if(A.length!=B.length){
            return false;
        }
        Map<Integer,Integer> mapA=new HashMap<>();
        Map<Integer,Integer> mapB=new HashMap<>();
        // Populate the maps with element frequencies from both arrays.
        for(int element:A) {
            mapA.put(element,mapA.getOrDefault(element,0)+1);
        }
        for(int element:B) {
            mapB.put(element,mapB.getOrDefault(element,0)+1);
        }
        // Check if the maps are equal (same elements and counts) for both arrays.
        return mapA.equals(mapB);
    }
    public static void main(String[] args) {
        int[] A={1, 2, 3, 4, 4, 5};
        int[] B={4, 3, 2, 5, 1, 4};
        boolean result=areEqualArrays(A,B);
        System.out.println("Are the arrays equal? "+result);
    }
}
