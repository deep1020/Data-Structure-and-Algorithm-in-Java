package Two_Pointers;

import java.util.Arrays;

public class remove_duplicate_from_string {

    static String removeDuplicate(String str){
        char arr[]=str.toCharArray();
        Arrays.sort(arr); // aabbbcccd
        int idx=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[idx]=arr[i+1];
                idx++;
            }
        }
        str=new String(arr);
        return str.substring(0,idx);
    }
    public static void main(String[] args) {
        String str="bcabbccda";
        System.out.println(removeDuplicate(str)); // abcd
    }
}
// T.C-> O(nlogn)
// S.C-> O(1)
// sort and two pointer approach
