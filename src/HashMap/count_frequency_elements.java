package HashMap;

import java.util.HashMap;
import java.util.Map;

public class count_frequency_elements {
    static void countOccurence(int arr[]){
        Map<Integer,Integer> map=new HashMap<>();
        // Traverse through array elements
//        for(int i=0;i<arr.length;i++){
//            if(map.containsKey(arr[i])){
//                map.put(arr[i], map.get(arr[i])+1);
//              If arr[i] exists as a key in HashMap, the expression mp.get(arr[i]) will return the corresponding value.
//              In this case, the value represents the count or occurrence of the element arr[i] in the array.
//            }
//            else {
//                map.put(arr[i],1);
//            }
//        }
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        // Traverse through map and print frequencies
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println("Frequency of "+entry.getKey()+ " -> "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        int arr[]={4,7,2,7,8,4,7,2};
        countOccurence(arr);
    }
}
