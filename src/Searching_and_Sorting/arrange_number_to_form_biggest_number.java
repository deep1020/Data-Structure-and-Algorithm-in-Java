package Searching_and_Sorting;

import java.util.Arrays;

public class arrange_number_to_form_biggest_number {
    static String largestNumber(String arr[]){
        Arrays.sort(arr,(a,b)-> {
            String str1=a+b;
            String str2=b+a;
            return str2.compareTo(str1);
        });
        StringBuilder sb=new StringBuilder();
        for(String num:arr){
            sb.append(num);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String arr[]={"3","30","34","5","9"};
        System.out.println(largestNumber(arr));
    }
}
