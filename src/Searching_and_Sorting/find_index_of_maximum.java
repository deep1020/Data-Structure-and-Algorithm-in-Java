package Searching_and_Sorting;

public class find_index_of_maximum {
    public static int findPeakElement(int nums[]) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]>nums[mid+1]){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int nums[]={6,3,4,2};
        System.out.println(findPeakElement(nums));
    }
}
