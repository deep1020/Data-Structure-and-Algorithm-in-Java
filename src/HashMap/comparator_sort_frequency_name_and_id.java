package HashMap;

import java.util.*;

public class comparator_sort_frequency_name_and_id {
    static List<String[]> sortByFrequencyNameId(String arr[][]){
        Map<String,Integer> map=new HashMap<>();
        for(String pair[]:arr){
            String name=pair[1];
            map.put(name,map.getOrDefault(name,0)+1);
        }
        Arrays.sort(arr,(a,b)->{
            int freqA=map.get(a[1]);
            int freqB=map.get(b[1]);
            if(freqA!=freqB){
                return freqB-freqA; // sort by frequency
            }
            int nameCompare=a[1].compareTo(b[1]);
            if(nameCompare!=0){
                return nameCompare;
            }
            else{
                return Integer.parseInt(a[0])-Integer.parseInt(b[0]);
            }
        });
        List<String[]> list=new ArrayList<>(Arrays.asList(arr));
        return list;
    }
    public static void main(String[] args) {
        String arr[][]={
                {"103","Deep"},
                {"105","Raj"},
                {"101","Deep"},
                {"104","Raj"},
                {"102","Raj"},
                {"106","Aryan"},
                {"107","Deep"},
        };
        List<String[]> sortedList=sortByFrequencyNameId(arr);
        for(String pair[]:sortedList){
            System.out.println(Arrays.toString(pair));
        }

    }
}
