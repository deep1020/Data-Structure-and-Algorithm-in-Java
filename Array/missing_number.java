package Array;

import java.util.Arrays;

public class missing_number {

	public static void main(String[] args) {
		int nums[] = {1,5,4,9};
		int n=nums.length;
		Arrays.sort(nums);
		for(int i=0;i<n;i++) {
			if(nums[i]!=i+1) {
//				i++;
//				System.out.println(i);
				while((nums[i]-i)>nums[0]){
					System.out.println((i+nums[0]) + " ");
					nums[0]++;
				}
			}
		}
//		System.out.println(nums[n-1]+1);
	}

}
