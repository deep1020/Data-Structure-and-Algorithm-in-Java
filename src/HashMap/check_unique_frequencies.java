package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class check_unique_frequencies {
    static boolean checkUniqueFreq(int arr[]){
        Map<Integer,Integer> freqMap=new HashMap<>();
        // count frequency of each element in array
        // key-> elements in array, value-> frequency of that element
        for(int num:arr){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1); // [1,3], [3,2], [5,2]
        }

        Set<Integer> uniqueFreq=new HashSet<>();
        for(Map.Entry<Integer,Integer> i:freqMap.entrySet()){ // Take entry from HashMap [1,3], [3,2], [5,2] and store in i
            if(uniqueFreq.contains(i.getValue())){  // getValues()-> 3,2,2 it contains two times 2
                return false;
            }
            else {  // why adding else part?-> [1,2] output-> true expected output-> false
                uniqueFreq.add(i.getValue());
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2};
        System.out.println(checkUniqueFreq(arr));
    }
}
