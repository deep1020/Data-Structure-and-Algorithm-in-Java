package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class find_duplicate_numbers {
    static List<Integer> printDuplicates(int arr[]){
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();
        for(int num:arr){
            countMap.put(num,countMap.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: countMap.entrySet()){
            if(entry.getValue()>1){
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }
    public static void main(String[] args) {
        int arr[]={4,2,5,7,2,4,3,4,7};
        List<Integer> duplicates=printDuplicates(arr);
        System.out.println(duplicates);
    }
}
// In map-> [4,3],[2,2],[5,1],[7,3]
// if map's value is greater than 1, key will be added in new List and print List