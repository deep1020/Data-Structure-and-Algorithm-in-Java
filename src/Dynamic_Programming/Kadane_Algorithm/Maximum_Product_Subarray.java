package Dynamic_Programming.Kadane_Algorithm;

public class Maximum_Product_Subarray {
    static int maxProduct(int[] nums) {
        int maxProd=nums[0];
        int minProd=nums[0];
        int result=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp=maxProd;
                maxProd=minProd;
                minProd=temp;
            }
            maxProd=Math.max(nums[i],maxProd*nums[i]);
            minProd=Math.min(nums[i],minProd*nums[i]);
//            System.out.println("MaxProd: "+maxProd);
//            System.out.println("MinProd: "+minProd);
            result=Math.max(result,maxProd);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums={2,3,-2,4,1};
        System.out.println("Maximum Product Subarray: "+maxProduct(nums));
    }
}
// T.C -> O(n) where n= length of nums array
// Iterate through the array once and all operations within the loop (comparison, multiplication, etc.) are constant time operations
// S.C -> O(1) We are using only a few extra variables (maxProd, minProd, result), and the space required does not depend on the size of the input array nums

// We need to track the maximum and minimum products at each step while iterating through the array so that a negative number can flip the product behavior (e.g., turning a small product into a large one)
// Initialize maxProd, minProd, result to first element nums[0]
// maxProd= maximum product of the subarray found up to the current element
// minProd= minimum product of the subarray found up to the current element (to handle negative number)
// result= overall maximum product found during the iteration
// Loop through the Array (starting from index 1):
// Handling Negative Numbers:
// If nums[i] is negative, we swap maxProd and minProd. This is because a negative number multiplied by the current maxProd could become the new minProd, and vice versa
// The new maxProd is the maximum of either the current element (nums[i]) itself, or the product of the current element and the previous maxProd (since a subarray may start at the current element or include it in the ongoing product)
// Similarly, the new minProd is the minimum of either the current element (nums[i]), or the product of the current element and the previous minProd
// update result to store the largest maxProd encountered so far

// Dry run:
// Input: nums=[2,3,-2,4]
// Initialization: maxProd = 2, minProd = 2, result = 2

// At i = 1 (nums[1] = 3):
// Since nums[i] > 0, no swapping of maxProd and minProd
// maxProd = max(3, 2 * 3) = 6
// minProd = min(3, 2 * 3) = 3
// result = max(2, 6) = 6

// At i = 2 (nums[2] = -2):
// Since nums[i] < 0, we swap maxProd and minProd. Now, maxProd = 3 and minProd = 6
// maxProd = max(-2, 3 * -2) = -2
// minProd = min(-2, 6 * -2) = -12
// result = max(6, -2) = 6

// At i = 3 (nums[3] = 4):
// Since nums[i] > 0, no swapping
// maxProd = max(4, -2 * 4) = 4
// minProd = min(4, -12 * 4) = -48
// result = max(6, 4) = 6

// maximum product of any subarray is 6