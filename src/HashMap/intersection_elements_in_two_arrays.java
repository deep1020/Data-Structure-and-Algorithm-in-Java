package HashMap;
// Refer leetcode question 349. Intersection of Two Arrays
import java.util.*;

public class intersection_elements_in_two_arrays {
    static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for(int num:nums2){
            if(map.containsKey(num) && map.get(num)>0){
                list.add(num);
                map.put(num,map.get(num)-1);
            }
        }
        int result[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int arr1[]={1,1,2,2,2};
        int arr2[]={1,1,1,2,2,3,4,5};
        int result[]=intersection(arr1,arr2);
        System.out.println(Arrays.toString(result));
    }
}
// Input: arr1: [1,1,2,2,2] arr2: [1,1,1,2,2,3,4,5]
// Output: [1,1,2,2]
// arr1: map -> (1,2), (2,3)
