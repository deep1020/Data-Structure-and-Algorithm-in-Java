package Searching_and_Sorting;

public class find_maximum {
    static int findMax(int nums[]){
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<nums[right]){
                left=mid+1;
            }
            else if(nums[mid]>nums[right]){
                right=mid;
            }
            else {
                right-=1;
            }
        }
        return nums[left];
    }
    public static void main(String[] args) {
        int nums[]={2,4,3,4};
        System.out.println(findMax(nums));
    }
}
