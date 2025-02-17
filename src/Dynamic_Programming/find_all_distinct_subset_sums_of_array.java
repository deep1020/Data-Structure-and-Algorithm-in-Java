package Dynamic_Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class find_all_distinct_subset_sums_of_array {
    static int[] printDistSum(int[] arr){
        int sum=0;
        for(int num:arr){
            sum+=num; // Calculate the total sum of the array
        }
        // DP array to store which sums are possible
        boolean[] dp=new boolean[sum+1];
        dp[0]=true; // Sum 0 is always possible (empty subset)
        // Traverse each element in the array
        for(int i=0;i<arr.length;i++){
            // Update dp array in reverse order
            for(int j=sum;j>=arr[i];j--){
                if(dp[j-arr[i]]){
                    dp[j]=true;
                }
            }
        }
        // Collect all the distinct sums
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<=sum;i++){
            if(dp[i]){
                result.add(i);
            }
        }
        // Convert List to array and return
        return result.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) {
        int[] arr={1,2,5,6};
        int[] distinctSums=printDistSum(arr);
        System.out.println(Arrays.toString(distinctSums));
    }
}
// Distinct Subsets: {},{1},{2},{5},{6},{1,2},{1,5},{1,6},{2,5},{2,6},{5,6},{1,2,5},{1,5,6},{2,5,6},{1,2,5,6}
// 0,1,2,3,5,6,7,8,9,11,12,13,14

// T.C -> O(n*sum) where n= number of elements in an array and sum= sum of all elements
// This is because for each element, we are updating all possible sums
// S.C -> O(sum) we are using a DP array of size sum+1 to track possible sums

// 1) Initialize a DP array (dp[]) where dp[0] = true, indicating that the sum 0 is always possible.
// 2) For each element in the array, we go through the dp[] array in reverse order (from sum to the current element).
// This ensures that for each subset sum that was previously possible, we also mark the sum formed by adding the current element.
// 3) Once the DP array is fully processed, all indices with true represent valid subset sums.
// We collect these into a list, convert the list to an array, and return it.

// 1) Initialize sum variable to 0. We iterate through array arr to calculate the total sum of all elements in the array.
// This value represents the upper bound on the largest possible subset sum.
// For arr= {1,2,5,6}, total sum= 1+2+5+6=14.
// 2) dp array setup
// dp[] is created with size sum+1. Each index j of this array will be true if there exists a subset of the array that adds up to j.
// dp[0] = true because a sum of 0 can always be achieved using the empty subset.
// Initial state: sum = 14 (total sum of array elements), dp= {true,false,false,...,false} (size 15).
// 3) Filling DP array:
// The outer loop iterates through each element of the array (arr[i]), and for each element, the inner loop updates the DP array in reverse order,
// checking if any sums are possible using that element.
// For each arr[i], we iterate from sum down to arr[i]. This reverse order ensures that the current element is only added once to any subset sum being calculated.
// If dp[j - arr[i]] is true, it means a sum of j - arr[i] is possible. Thus, by adding arr[i], the sum j becomes possible, so we set dp[j] = true.
// 4) Collecting results:
// loop collects all the subset sums that are possible, indicated by the true values in the dp[] array. These subset sums are added to the result list.
// The result list of distinct sums is converted to an array of integers using Java streams.

// Dry run:
// First Iteration (i=0, arr[i]=1):
// We process the element 1:
// Start with j = sum = 14 and go down to j = arr[i] = 1.
// For each j, we check if dp[j - arr[i]] is true. If it is, we set dp[j] = true (indicating that sum j is possible with the subset including 1
// Step-by-step updates:
// For j = 14: dp[14 - 1] = dp[13] is false, so no change.
// For j = 13: dp[13 - 1] = dp[12] is false, so no change.
// ...
// For j = 1: dp[1 - 1] = dp[0] is true, so set dp[1] = true.
// dp[] after processing 1:
// dp = {true, true, false, false, false, false, false, false, false, false, false, false, false, false, false}

// Second Iteration (i = 1, arr[i] = 2):
// We process the element 2:
// Start with j = sum = 14 and go down to j = arr[i] = 2.
// For each j, if dp[j - arr[i]] is true, we set dp[j] = true.
// Step-by-step updates:
// For j = 14: dp[14 - 2] = dp[12] is false, so no change.
// For j = 13: dp[13 - 2] = dp[11] is false, so no change.
// ...
// For j = 3: dp[3 - 2] = dp[1] is true, so set dp[3] = true.
// For j = 2: dp[2 - 2] = dp[0] is true, so set dp[2] = true.
// dp[] after processing 2:
// dp = {true, true, true, true, false, false, false, false, false, false, false, false, false, false, false}

// Similarly perform Third Iteration (i = 2, arr[i] = 5) and Fourth Iteration (i = 3, arr[i] = 6)
// Final dp array: dp = {true, true, true, true, false, true, true, true, true, true, false, true, true, true, true}
// This means the distinct sums that can be formed from the subsets of the array are the indices where dp[i] = true, which are:
// {0, 1, 2, 3, 5, 6, 7, 8, 9, 11, 12, 13, 14}
