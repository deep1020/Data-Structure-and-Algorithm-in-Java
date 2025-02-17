package Dynamic_Programming.Longest_Increasing_Subsequence;
// 673. Number of Longest Increasing Subsequence
import java.util.Arrays;

public class number_of_longest_increasing_subsequence {
    static int numberOfLIS(int[] nums){
        int n=nums.length;
        int[] dp=new int[n];
        int[] count=new int[n];
        Arrays.fill(dp,1);
        Arrays.fill(count,1);
        int max=1;
        for(int i=0;i<n;i++) {
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    if(dp[j]+1>dp[i]){
                        dp[i]=dp[j]+1;
                        count[i]=count[j];
                    }
                    else if(dp[j]+1==dp[i]){
                        count[i]+=count[j];
                    }
                }
                max=Math.max(dp[i],max);
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(dp[i]==max){
                ans+=count[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={1,3,5,4,7};
        System.out.println(numberOfLIS(nums));
    }
}
// T.C -> O(n^2)
// Nested loops iterate over input array nums, resulting in O(n^2) time complexity
// Outer loop iterates n times and inner loop iterates up to i times, where i ranges from 0 to n-1
// S.C -> O(n)
// We store two DP arrays: length and count, each with a length of n

// Dynamic Programming Approach:
// dp[i]= Length of the longest increasing subsequence ending at index i
// count[i]= Number of longest increasing subsequences ending at index i
// For each element in nums, iterate over all previous elements to:
// Update the longest increasing subsequence length (dp)
// Update the count of such subsequences (count)

// Steps:
// 1) Initialization:
// dp[i] and count[i] are initialized to 1 for all indices as each element alone is an LIS of length 1, and there's exactly one subsequence of this kind
// 2) Iteration:
// Outer loop i: Processes each element of nums
// Inner loop j: Compares the current element nums[i] with all previous elements nums[j]
// 3) DP transitions:
// If nums[i] > nums[j]
// Case 1: A longer subsequence is found via nums[j]:
// Update dp[i]=dp[j]+1 and Set count[i]=count[j] (inherit the count of subsequences from j)
// Case 2: Another subsequence of the same length is found:
// Add the count of subsequences from j to i: count[i]+=count[j]
// 4) Track maximum length:
// Keep track of the maximum length of LIS (max)
// 5) Count the subsequences:
// Sum all count[i] where dp[i]==max