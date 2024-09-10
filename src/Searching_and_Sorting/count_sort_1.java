package Searching_and_Sorting;
import java.util.Arrays;
public class count_sort_1 {
    public static int[] countingSort(int nums[]){
        // Find the maximum element in the array
        int maxVal=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>maxVal){
                maxVal=num;
            }
//            maxVal=Math.max(maxVal,num);
        }
        // Create a count array to store the frequency of each element
        int count[]=new int[maxVal+1];
        // Count the occurrences of each element
        for(int num:nums){ //     2 2     1   1
            count[num]++;  // 0 1 2 3 4 5 6 7 8
        }
//        int count[]=new int[101];
//        for(int num:nums){
//            count[num]++;
//        }
        // Create a result array to store the sorted elements
//        int result[]=new int[nums.length];
        int index=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                nums[index++]=i;
                count[i]--;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int nums[]={6,2,3,2,8,3};
        System.out.println("Original array: "+ Arrays.toString(nums));
        int sorted[]=countingSort(nums);
        System.out.print("Sorted array: "+Arrays.toString(sorted));
    }
}
// T.C -> O(n+m) where n and m are size of nums[] and result[] array respectively
// S.C -> O(n+m) where n and m are space taken by nums[] and result[] array respectively
