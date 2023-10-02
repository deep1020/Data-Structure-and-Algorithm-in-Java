package Array;
import java.util.Arrays;
public class missing_number {
// Find missing elements between left and right most elements in sorted array
	static void missingNumber(int nums[]){
		Arrays.sort(nums); // 1,5,4,9
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=i+1){
				while((nums[i]-i)>nums[0]){
					System.out.print((i+nums[0]) + " ");
					nums[0]++;
				}
			}
		}
	}
	public static void main(String[] args) {
		int nums[] = {1,5,4,9};
		missingNumber(nums);
	}
}
// T.C -> O(nlogn)
// S.C -> O(1)
//int nums[] = {1,5,4,9};
//int n=nums.length;
//	Arrays.sort(nums); // {1,4,5,9}
//			for(int i=0;i<n;i++) {
//	if(nums[i]!=i+1) {
//	while((nums[i]-i)>nums[0]){
//	System.out.print((i+nums[0]) + " ");
//	nums[0]++;
//	}
//	}
//	}
