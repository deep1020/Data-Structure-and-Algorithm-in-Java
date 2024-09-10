package Searching_and_Sorting;

import java.util.Arrays;

public class binary_search_boolean {
    static boolean search(int nums[],int target){
        for(int num:nums){
            if(num==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={3,5,2,1,7};
        int target=1;
        System.out.println(search(nums,target));
    }
}
// T.C -> O(n)
// S.C -> O(1)


//        Arrays.sort(nums);
//        int left=0;
//        int right=nums.length;
//        while(left<=right){
//            int mid=left+(right-left)/2;
//            if(nums[mid]==target){
//                return true;
//            }
//            else if(target>nums[mid]){
//                left=mid+1;
//            }
//            else{
//                right=mid-1;
//            }
//        }
//        return false;
// T.C -> O(nlogn)
// S.C -> O(1)