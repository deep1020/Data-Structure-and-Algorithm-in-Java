package Array;

import java.util.Arrays;

public class product_of_array_except_self {
    static int[] productExceptSelf(int nums[]){
        int n=nums.length;
        int ans[]=new int[n];
        int leftproduct=1;
        for(int i=0;i<n;i++){
            ans[i]=leftproduct;
            leftproduct*=nums[i];
        }
        int rightproduct=1;
        for(int i=n-1;i>=0;i--){
            ans[i]*=rightproduct;
            rightproduct*=nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        int ans[]=productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }
}
