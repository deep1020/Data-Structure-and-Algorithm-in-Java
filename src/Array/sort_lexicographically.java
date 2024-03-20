package Array;

import java.util.Arrays;

public class sort_lexicographically {
    public static void printArray(String strArr[]){
        for(String str_set:strArr){
            System.out.println(str_set+" ");
        }
    }
    public static void main(String[] args) {
        String str_set[]={"Harit","Girish","Gritav","Lovenish","Nikhil","Harman"};
        Arrays.sort(str_set,String.CASE_INSENSITIVE_ORDER);
        printArray(str_set);
    }
}
// T.C -> O(nlogn)