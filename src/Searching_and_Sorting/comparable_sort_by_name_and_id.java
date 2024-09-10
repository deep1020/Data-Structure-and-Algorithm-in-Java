package Searching_and_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class comparable_sort_by_name_and_id {
    static List<String[]> sortNameandId(String arr[][]){
        List<String[]> list=new ArrayList<>(Arrays.asList(arr));
        list.sort((a,b)->{
            int nameCompare=a[1].compareTo(b[1]);
            if(nameCompare!=0){
                return nameCompare;
            }
            else{
                return Integer.compare(Integer.parseInt(a[0]),Integer.parseInt(b[0]));
            }
        });
        return list;
    }
    public static void main(String[] args) {
        String arr[][]={{"103", "Deep"}, {"102", "Raj"}, {"101", "Deep"}};
        List<String[]> sortedList=sortNameandId(arr);
        for(String entry[]:sortedList){
            System.out.println(Arrays.toString(entry));
        }

    }
}
