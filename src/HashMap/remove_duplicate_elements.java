package HashMap;

import java.util.*;

public class remove_duplicate_elements {
    static int[] removeDuplicates(int arr[]){
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> uniqueElements=new ArrayList<>();
        for(int num:arr){
            if(map.get(num)==1){
                uniqueElements.add(num);
            }
        }
        int result[]=new int[uniqueElements.size()];
        for(int i=0;i<uniqueElements.size();i++){
            result[i]=uniqueElements.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,4,5,5};
        int result[]=removeDuplicates(arr);
        System.out.println(Arrays.toString(result));
    }
}
