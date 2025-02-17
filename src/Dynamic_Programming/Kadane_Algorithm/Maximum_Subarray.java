package Dynamic_Programming.Kadane_Algorithm;

import java.util.Arrays;

public class Maximum_Subarray {
    static int[] maxSubArray(int[] nums){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int start=0,end=0,tempStart=0;
        for(int i=0;i<nums.length;i++) {
            currSum+=nums[i];
            if(currSum>maxSum){
                maxSum=currSum;
                start=tempStart;
                end=i;
            }
            // Reset currSum if it drops to 0 or below
            if(currSum<0){
                currSum=0;
                tempStart=i+1;
            }
        }
        int[] result=new int[end-start+1];
        for(int i=start;i<=end;i++){
            result[i-start]=nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        int[] result=maxSubArray(nums);
        System.out.println(Arrays.toString(result));
    }
}
// T.C -> O(n) where n= number of elements in nums array
// Loop iterate through nums array
// S.C -> O(k) where k= size of subarray

// 1) Initialization:
// - maxSum stores the maximum sum encountered so far.
// - currentSum: keeps track of the running sum of the current subarray.
// - start,end: track the boundaries of the maximum sum subarray.
// - tempStart: update the start index when resetting currentSum.
// 2) Iteration:
// - Add the current element to currentSum.
// - If currentSum exceeds maxSum, update maxSum, start, and end.
// - If currentSum drops below 0, reset it to 0 and set tempStart to the next index.
// 3) Subarray Extraction:
// - After finding the start and end indices of the subarray, extract it into a new array.