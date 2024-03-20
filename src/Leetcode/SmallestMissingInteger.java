package Leetcode;

import java.util.Arrays;

public class SmallestMissingInteger {

    public static int findSmallestMissingInteger(int[] nums) {
        Arrays.sort(nums);

        int longestSequentialPrefixSum = 0;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] == nums[i - 1] + 1) {
                currentSum += nums[i];
            } else {
                currentSum = nums[i];
            }

            longestSequentialPrefixSum = Math.max(longestSequentialPrefixSum, currentSum);
        }

        // Find the smallest missing integer
        int missingInteger = longestSequentialPrefixSum + 1;

        for (int num : nums) {
            if (num >= missingInteger) {
                return missingInteger;
            }
        }

        return missingInteger;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 2, 3, 2, 5};
        System.out.println("Example 1 Output: " + findSmallestMissingInteger(nums1));

        // Example 2
        int[] nums2 = {3, 4, 5, 1, 12, 14, 13};
        System.out.println("Example 2 Output: " + findSmallestMissingInteger(nums2));
    }
}
