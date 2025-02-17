package Dynamic_Programming.Kadane_Algorithm;
// 53. Maximum Subarray
public class Maximum_Subarray_Sum {
    static int maxSubArraySum(int[] nums){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE; // Initialize the smallest possible value
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            maxSum=Math.max(maxSum,currSum);
            if(currSum<=0){
                currSum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum Subarray Sum: "+maxSubArraySum(nums));
    }
}
// T.C -> O(n)
// S.C -> O(1)

//Given an integer array nums, find the subarray with the largest sum, and return its sum.
//Example 1:
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: The subarray [4,-1,2,1] has the largest sum 6

// Brute Force Approach => O(n^2)

//static int maxSubArray(int[] nums) {
//    int maxSum=Integer.MIN_VALUE; // Initialize the smallest possible value
//    for(int i=0;i<nums.length;i++){ // Iterate through each starting index
//        int currSum=0;
//        for(int j=i;j<nums.length;j++){ // Iterate through each ending index starting from i
//            currSum+=nums[j]; // Add the current element to the sum
//            maxSum=Math.max(maxSum,currSum); // Update the maximum sum if the current sum is larger
//        }
//    }
//    return maxSum; // Return the largest sum found
//}
