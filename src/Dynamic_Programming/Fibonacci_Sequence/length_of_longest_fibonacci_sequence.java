package Dynamic_Programming.Fibonacci_Sequence;
//873. Length of Longest Fibonacci Subsequence
public class length_of_longest_fibonacci_sequence {
    // Bottom-up approach
    static int lenLongestFibSubseq(int[] arr) {
        int n=arr.length;
        int result=0;
        int[][] dp=new int[n][n];
        for(int i=2;i<n;i++){
            int left=0;
            int right=i-1;
            while(left<right){
                int sum=arr[left]+arr[right];
                if(sum>arr[i]){
                    right--;
                }
                else if(sum<arr[i]){
                    left++;
                }
                else{
                    dp[right][i]=dp[left][right]+1;
                    result=Math.max(result,dp[right][i]);
                    left++;
                    right--;
                }
            }
        }
        if(result!=0){
            return result+2;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr={1,3,7,11,12,14,18};
        System.out.println(lenLongestFibSubseq(arr));
    }
}
// T.C -> O(n^2)
// The outer loop iterates through each i from 2 to n−1: O(n)
// For each i, the two-pointer approach iterates through the array: O(n)
// Overall time complexity is O(n^2)
// S.C -> O(n^2)
// dp array has dimension n*n= n^2

// Given a strictly increasing array arr of positive integers forming a sequence, return the length of the longest Fibonacci-like subsequence of arr.
// If one does not exist, return 0.
//Input: arr = [1,3,7,11,12,14,18]
//Output: 3
//Explanation: The longest subsequence that is fibonacci-like: [1,11,12], [3,11,14] or [7,11,18].

// Approach: Dynamic Programming (bottom-up) and two-pointers
// 1) Dynamic Programming Table (dp):
// - dp[i][j] represents the length of the Fibonacci-like subsequence where arr[j] is the last element, and arr[i] is the second-to-last element
// 2) Two pointers implementation:
// - For every arr[i] (as the third element in a potential Fibonacci sequence), a two-pointer approach is used to find two numbers arr[left] and arr[right] such that:
// - If such numbers are found, the length of the sequence ending at arr[right] and arr[i] is updated in dp[right][i]
// 3) Result tracking:
// - The result variable tracks the longest Fibonacci-like subsequence found so far. If no valid subsequence is found, the function returns 0. If result is greater than 0, return result + 2 (to include the first two elements of the sequence)
