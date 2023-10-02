package HashSet;

import java.util.HashSet;
import java.util.Set;

public class find_duplicate_numbers {
    static void printDuplicates(int arr[]){
        Set<Integer> uniqueNumbers=new HashSet<>();
        Set<Integer> duplicateNumbers=new HashSet<>();
        for(int num:arr){
            if(!uniqueNumbers.add(num)){
                duplicateNumbers.add(num);
            }
        }
        System.out.println(duplicateNumbers);
    }
    public static void main(String[] args) {
        int arr[]={4,2,5,7,2,4,3,4,7};
        printDuplicates(arr);
    }
}
// T.C -> O(n)
// S.C -> O(n)
