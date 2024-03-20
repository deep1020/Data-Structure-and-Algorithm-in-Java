package Array;

import java.util.Arrays;

public class move_zeros_to_end {
    static void moveZeros(int nums[]){
        int nonZeroIndex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[nonZeroIndex];
                nums[nonZeroIndex]=temp;
                nonZeroIndex++;
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={3,0,1,5,0,2};
        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }
}
// T.C -> O(n)
// S.C -> O(1)