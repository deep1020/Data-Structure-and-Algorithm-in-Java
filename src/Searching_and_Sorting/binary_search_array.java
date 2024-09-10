package Searching_and_Sorting;

public class binary_search_array {
	public static int binarySearch(int nums[], int target) {
		int left=0;
        int right=nums.length;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
		return -1;
	}
	public static void main(String[] args) {
		int nums[] = {10, 20, 30, 40, 50}; // array must be sorted
		int target = 40;
		int result = binarySearch(nums,target);
		if (result == -1) {
			System.out.println(target + " is not present in the array");
		} else {
			System.out.println(target + " is present at index " + result);
		}
	}
}
