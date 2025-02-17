package Dynamic_Programming.Longest_Increasing_Subsequence;

import java.util.Arrays;

public class maximum_number_of_envelopes {
    static int maxEnvelopes(int[][] envelopes){
        Arrays.sort(envelopes,(a, b) -> a[0]==b[0] ? b[1]-a[1] : a[0]-b[0]);
        int[] dp=new int[envelopes.length];
        int maxLen=0;
        for(int i=0;i<dp.length;i++){
            int pos=binarySearch(dp,0,maxLen,envelopes[i][1]);
            // System.out.println(pos);
            dp[pos]=envelopes[i][1];
            if(pos==maxLen){
                maxLen++;
            }
        }
        return maxLen;
    }
    private static int binarySearch(int[] arr,int left,int right,int target){
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[][] envelopes={{5,4},{6,4},{6,7},{2,3}};
        System.out.println(maxEnvelopes(envelopes));
    }
}
// T.C -> O(nlogn) where n= number of envelopes
// Sorting an envelope takes O(nlogn) time
// For each envelope n, perform binary search on dp array taking O(logn) time
// S.C -> O(n)
// dp array has a size proportional to the number of envelopes

// Dynamic Programming Approach optimized with binary search:
// 1) Sort envelopes:
// - Sort the envelopes based on width in ascending order
// - For envelopes with the same width, sort by height in descending order
// - Sorting ensures that we only need to focus on increasing heights to find the longest subsequence
// - Sorting heights in descending order for envelopes with the same width avoids incorrect nesting of envelopes with the same width (e.g. [5,4] and [5,7] cannot be nested)
// 2) Use DP Array for Longest Increasing Subsequence (LIS)
// - Use a DP array dp to store the smallest possible ending height of an increasing subsequence of a particular length
// - For each envelope use binary search on dp to find the position where the current height can be placed
// - Update the dp array:
// - If the position is equal to maxLen, extend the LIS by increasing maxLen
// - Otherwise, replace the element at the position with the current height to maintain the smallest ending height for subsequences of that length
// 3) Binary search:
// - Perform binary search on the DP array to find the first position where the height is greater than or equal to the target:
// - If no such position is found, return the next available position (end of the current sequence)
// - Update the DP array with the current height at the found position

// Dry run:
// envelopes = [[5,4],[6,4],[6,7],[2,3]]
// Sorted envelopes: [[2,3],[5,4],[6,7],[6,4]]
// Initialize dp=[] and maxLen=0
// Iterations:
// Envelope: [2,3], pos=0, dp=[3], maxLen=1
// Envelope: [5,4], pos=1, dp=[3,4], maxLen=2
// Envelope: [6,7], pos=2, dp=[3,4,7], maxLen=3
// Envelope: [6,4], pos=3, dp=[3,4,7], maxLen=3