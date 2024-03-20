package HashSet;

import java.util.HashSet;
import java.util.Set;

public class find_minimum_common_values_in_two_arrays {
    public static int findMinimumCommonValue(int nums1[],int nums2[]){
        Set<Integer> set=new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        int minCommonValue=Integer.MAX_VALUE;
        for(int num:nums2){
            if(set.contains(num)){
                minCommonValue=Math.min(minCommonValue,num);
            }
        }
        if(minCommonValue==Integer.MAX_VALUE){
            return -1;
        }
        return minCommonValue;
    }
    public static void main(String[] args) {
        int nums1[]={2,1,3};
        int nums2[]={4,2,3};
        System.out.println(findMinimumCommonValue(nums1,nums2));
    }
}
