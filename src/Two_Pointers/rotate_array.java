package Two_Pointers;

public class rotate_array {
    static void reverse(int nums[],int left, int right){
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
    static void rotate(int[] nums, int k) {
        if(k<nums.length){
            reverse(nums,0,nums.length-1);
            reverse(nums,0,k-1);
            reverse(nums,k,nums.length-1);
        }
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int k=9;
        rotate(nums,k);
        for(int arr:nums){
            System.out.print(arr+" ");
        }
    }
}
