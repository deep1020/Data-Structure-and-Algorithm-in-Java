// Two pointer approach
package Array;
import java.util.Arrays;
public class two_sum {
    static int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int result[]=new int[2];
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==target){
                result[0]=left;
                result[1]=right;
                return result;
            }
            else if(sum>target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int nums[]={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}
