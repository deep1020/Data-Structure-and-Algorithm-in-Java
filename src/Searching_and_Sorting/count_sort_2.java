package Searching_and_Sorting;

import java.util.Arrays;

public class count_sort_2 {
    public static int[] countingSort(int nums[]) {
        int maxVal=Integer.MIN_VALUE;
        for (int num:nums){
            maxVal=Math.max(maxVal,num);
        }
        int count[]=new int[maxVal+1];
        // Count the occurrences of each element
        for(int num:nums){ //     2 2     1   1
            count[num]++;  // 0 1 2 3 4 5 6 7 8
        }
        // Calculate the prefix sum at every index (except 0th index) of count array
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        // Find the index of each element in the original array and put it into result array
        int result[]=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            int idx=count[nums[i]]-1;
            result[idx]=nums[i];
            count[nums[i]]--;
        }
        return result;
        // copy all elements of result to nums
//        for(int i=0;i<nums.length;i++){
//            nums[i]=result[i];
//        }
    }
    public static void main(String[] args) {
        int nums[]={6,2,3,2,8,3};
        System.out.println("Original array: "+ Arrays.toString(nums));
        int sorted[]=countingSort(nums);
        System.out.print("Sorted array: "+Arrays.toString(sorted));
    }
}
