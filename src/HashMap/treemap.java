package HashMap;
// HashMap does not maintain any order neither based on key nor on basis of value.
// If we want the keys to be maintained in a sorted order, we need to use TreeMap.
// TreeMap can be a bit handy when we only need to store unique elements in a sorted order
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class treemap {

    public static void main(String[] args) {
        int arr[]={4,7,2,7,8,4,7,2};
        countOccurence(arr);
    }
    static void countOccurence(int arr[]){
        TreeMap<Integer,Integer> map=new TreeMap<>(Collections.reverseOrder());
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        // Traverse through map and print frequencies from highest to lowest value in array
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println("Frequency of "+entry.getKey()+ " -> "+entry.getValue());
        }
    }
}
