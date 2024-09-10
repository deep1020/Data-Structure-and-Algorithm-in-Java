package Searching_and_Sorting;

public class find_maximum {
    static int findMax(int nums[]){
        int left=0;
        int right=nums.length-1;
        while (left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]<nums[right]){
                left=mid+1;
            }
            else if(nums[mid]>nums[right]){
                right=mid;
            }
            else {
                right--;
            }
        }
//        while(left<right){
//            int mid=left+(right-left)/2;
//            if(nums[mid]<nums[mid+1]){
//                left=mid+1;
//            }
//            else{
//                right=mid;
//            }
//        }
        return nums[left];
    }
    public static void main(String[] args) {
//        int nums[]={2,4,3,5,3,6,4};
        int nums[]={2,4,5,3,6};
        System.out.println(findMax(nums));
    }
}
