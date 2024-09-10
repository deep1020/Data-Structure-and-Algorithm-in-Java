package Array;

public class prefix_sum {
    static int[] prefixSum(int nums[]){
        int sum[]=new int[nums.length];
        sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            sum[i]=sum[i-1]+nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        int prefixSum[]=prefixSum(nums);
        for(int sum:prefixSum){
            System.out.print(sum+" ");
        }
    }
}
