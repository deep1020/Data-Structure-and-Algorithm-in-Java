package Dynamic_Programming.Longest_Increasing_Subsequence;

import java.util.Arrays;

public class longest_increasing_subsequence {
    static int lengthofLIS(int[] nums){
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int maxLen=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            maxLen=Math.max(maxLen,dp[i]);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums={10,9,2,5,3,7,101,18};
        System.out.println(lengthofLIS(nums)); // Output: 4 -> [2,3,7,101]
    }
}
// T.C -> O(n^2)
// S.C -> O(n)

// Initialization: dp = [1, 1, 1, 1, 1, 1, 1, 1] and maxLen = 1
// Outer Loop:
// i = 0: No inner loop (no elements before 0). dp = [1, 1, 1, 1, 1, 1, 1, 1], maxLen = 1
// i = 1: Inner loop checks j = 0:
// nums[1] (9) < nums[0] (10) -> No update. dp = [1, 1, 1, 1, 1, 1, 1, 1], maxLen = 1.
// i = 2: Inner loop checks j = 0, 1:
// nums[2] (2) < nums[0] (10) -> No update.
// nums[2] (2) < nums[1] (9) -> No update.
// dp = [1, 1, 1, 1, 1, 1, 1, 1], maxLen = 1.
// i = 3: Inner loop checks j = 0, 1, 2:
// nums[3] (5) < nums[0] (10) -> No update.
// nums[3] (5) < nums[1] (9) -> No update.
// nums[3] (5) > nums[2] (2) -> dp[3] = max(dp[3], dp[2] + 1) = max(1,1+1) = 2
// dp = [1, 1, 1, 2, 1, 1, 1, 1], maxLen = 2.
// i = 4: Inner loop checks j = 0, 1, 2, 3:
// nums[4] (3) < nums[0] (10) -> No update.
// nums[4] (3) < nums[1] (9) -> No update.
// nums[4] (3) > nums[2] (2) -> dp[4]= max(dp[4],dp[2]+1) = max(1,1+1) = 2
// nums[4] (3) < nums[3] (5) -> No update.
// dp = [1, 1, 1, 2, 2, 1, 1, 1], maxLen = 2

// Repeat for all i.
// Final DP Array:
// dp = [1, 1, 1, 2, 2, 3, 4, 4]
// maxLen = 4 (LIS is [2, 3, 7, 101])