package Leetcode;

public class MinOperationsToXOR {

    public static int minOperations(int[] nums, int k) {
        int result = 0;
        int highestBit = 31; // Assuming integers are 32-bit

        while (highestBit >= 0 && ((k & (1 << highestBit)) == 0)) {
            highestBit--;
        }

        if (highestBit < 0) {
            return 0; // No operation needed, XOR is already k
        }

        for (int i = highestBit; i >= 0; i--) {
            if ((k & (1 << i)) != 0) {
                int index = -1;
                for (int j = 0; j < nums.length; j++) {
                    if ((nums[j] & (1 << i)) != 0) {
                        index = j;
                        break;
                    }
                }

                if (index == -1) {
                    continue; // No element with the bit set, move to the next bit
                }

                // Flip the bit for the chosen element
                for (int j = 0; j < nums.length; j++) {
                    if (j != index) {
                        nums[j] ^= (1 << i);
                    }
                }

                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {2, 1, 3, 4};
        int k1 = 1;
        System.out.println("Example 1 Output: " + minOperations(nums1, k1));

        // Example 2
        int[] nums2 = {2, 0, 2, 0};
        int k2 = 0;
        System.out.println("Example 2 Output: " + minOperations(nums2, k2));
    }
}
