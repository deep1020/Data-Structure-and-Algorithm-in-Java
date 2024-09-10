package HashMap;

import jdk.jfr.Frequency;

import java.util.*;

public class treemap_value_sorted {
    static void sortedValueOccurrence(int arr[]){
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        for(Map.Entry<Integer,Integer> entry:list){
            System.out.println("Frequency of "+entry.getKey()+" -> "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        int arr[]={4,7,2,7,8,4,7,2};
        sortedValueOccurrence(arr);
    }
}
